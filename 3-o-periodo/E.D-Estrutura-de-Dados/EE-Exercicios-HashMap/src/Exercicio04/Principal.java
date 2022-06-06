/*
    4. Faça um programa que realize a leitura da lista de Estados do Brasil presente em [1] e a
    lista de Municípios do Brasil presente em [2] e armazene estas informações em dois
    HashMaps:

    a. mapaEstados (chave: coluna COD e valor: Classe Estado com atributos
    COD, NOME e SIGLA)

    [1] - https://raw.githubusercontent.com/leogermani/estados-e-
    municipios-ibge/master/estados.csv

    b. mapaMunicipios (chave: coluna COD e valor: Classe Municipio com
    atributos COD UF, COD e NOME

    [2] - https://raw.githubusercontent.com/leogermani/estados-e-municipios-
    ibge/master/municipios.csv

    A coluna COD UF na Classe Municipio referencia a coluna COD de Estado. Exemplo: O
    município de Goiânia possui COD UF = 52 que é a referência ao Estado de Goiás (SIGLA

    = GO). Sabendo disto, faça um programa que ao ler os CSVs supracitados apresente o
    seguinte menu:
    a) Listar todos os Estados agrupados SIGLA.
    b) Listar todos os municípios agrupados por Código do Estado (COD UF).
    c) Listar municípios por SIGLA. O programa deve ler uma SIGLA e listar os
    municípios pertencentes aquele Estado.
    d) Buscar Município por Código Municipal, apresentando todas as informações
    do Município e do Estado a que aquele Município pertence.
    e) Retornar um ranking decrescente de Estados de acordo com a quantidade de
    municípios pertencentes a eles, agrupados por SIGLA.
 */
package Exercicio04;

/**
 *
 * @author anapriscilla
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        String line;
        HashMap<Integer, Cidade> cidades = new HashMap<>();
        HashMap<Integer, Estado> estados = new HashMap<>();

        try {
            FileReader ler = new FileReader("./src/Listas/ListaCidades");
            BufferedReader armazena = new BufferedReader(ler);
            line = armazena.readLine();
            while ((line = armazena.readLine()) != null) {

                String[] dados = line.split(",");
                int uf = Integer.parseInt(dados[0]);
                int cod = Integer.parseInt(dados[1]);
                String nome = dados[2];
                Cidade nova = new Cidade(cod, uf, nome);
                cidades.put(cod, nova);
            }

            FileReader lerEstados = new FileReader("./src/Listas/ListaEstados");
            armazena = new BufferedReader(lerEstados);
            line = armazena.readLine();
            while ((line = armazena.readLine()) != null) {
                String[] dados = line.split(",");
                int cod = Integer.parseInt(dados[0]);
                String nome = dados[1];
                String sigla = dados[2];
                Estado novo = new Estado(cod, nome, sigla);
                estados.put(cod, novo);
            }
            armazena.close();
        } catch (IOException e) {

        }

        System.out.println("Estados agrupados por sigla: ");
        ArrayList<Estado> auxEstados = new ArrayList<>();
        for (Integer key : estados.keySet()) {
            auxEstados.add(estados.get(key));
        }

        for (int i = 0; i < auxEstados.size(); i++) {
            for (int j = i; j < auxEstados.size(); j++) {
                if ((auxEstados.get(i).getSigla().compareTo(auxEstados.get(j).getSigla())) > 0) {
                    Estado temp = auxEstados.get(j);
                    auxEstados.set(j, auxEstados.get(i));
                    auxEstados.set(i, temp);
                }
            }
        }

        for (int i = 0; i < auxEstados.size(); i++) {
            System.out.println(auxEstados.get(i).getCod() + "," + auxEstados.get(i).getNome() + "," + auxEstados.get(i).getSigla());

        }

        System.out.println("\nCidades agrupadas por codigo da UF: ");
        ArrayList<Cidade> auxCidades = new ArrayList<>();
        for (Integer key : cidades.keySet()) {
            auxCidades.add(cidades.get(key));
        }

        for (int i = 0; i < auxCidades.size(); i++) {
            for (int j = i; j < auxCidades.size(); j++) {
                if (auxCidades.get(i).getUf() > auxCidades.get(j).getUf()) {
                    Cidade temp = auxCidades.get(j);
                    auxCidades.set(j, auxCidades.get(i));
                    auxCidades.set(i, temp);
                }
            }
        }

        for (int i = 0; i < auxCidades.size(); i++) {
            System.out.println(auxCidades.get(i).getCod() + "," + auxCidades.get(i).getUf() + "," + auxCidades.get(i).getNome());

        }

        try (Scanner lendo = new Scanner(System.in)) {
            System.out.println("""
                                           Digite uma sigla para listar os municípios:
                                           """);
            String entrada = lendo.next();
            
            boolean listaME = false;
            for (int i = 0; i < auxEstados.size(); i++) {
                if (auxEstados.get(i).getSigla().replaceAll(" ", "").equalsIgnoreCase(entrada)) {
                    if (listaME == false) {
                        System.out.println("Municípios no estado da sigla: " + entrada);
                    }
                    listaME = true;
                    
                    for (int i2 = 0; i2 < auxCidades.size(); i2++) {
                        if (auxCidades.get(i2).getUf() == auxEstados.get(i).getCod()) {
                            System.out.println(
                                    auxCidades.get(i2).getCod() + "," + auxCidades.get(i2).getUf() + "," + auxCidades.get(i2).getNome());
                        }
                    }
                    
                }

            }
            if (listaME == false) {
                System.out.println("Atenção! Não existe estado com a sigla digitada!");
            }
            
            System.out.println("Digite o código municipal que deseja buscar: ");
            int entrada2 = lendo.nextInt();
            
            listaME = true;
            
            for (int i = 0; i < auxCidades.size(); i++) {
                if (auxCidades.get(i).getCod() == entrada2) {
                    if (listaME == false) {
                        System.out.println("Informações do município número: " + entrada2);
                    }
                    listaME = true;
                    System.out.println();
                    System.out.println(auxCidades.get(i).getCod() + "," + auxCidades.get(i).getUf() + "," + auxCidades.get(i).getNome());
                    
                    for (int i2 = 0; i2 < auxEstados.size(); i2++) {
                        if (auxCidades.get(i).getUf() == auxEstados.get(i2).getCod()) {
                            System.out.println("Estado: " + auxEstados.get(i2).getCod() + "," + auxEstados.get(i2).getNome() + ","
                                    + auxEstados.get(i2).getSigla());
                        }
                    }
                    
                }

            }
            
            if (listaME == false) {
                System.out.println("Atenção! Não existe municípios com esse código!");
            }
            
            ArrayList<Integer> contaMPorE = new ArrayList<>();
            int aux;
            for (int i = 0; i < auxEstados.size(); i++) {
                aux = 0;
                int comparador = auxEstados.get(i).getCod();
                for (int i2 = 0; i2 < auxCidades.size(); i2++) {
                    if (auxCidades.get(i2).getUf() == comparador) {
                        aux++;
                    }
                    
                }
                contaMPorE.add(aux);
            }
            
            for (int i = 0; i < auxEstados.size(); i++) {
                
                for (int j = i; j < auxEstados.size(); j++) {
                    if (contaMPorE.get(i) < contaMPorE.get(j)) {
                        int temp1 = contaMPorE.get(j);
                        contaMPorE.set(j, contaMPorE.get(i));
                        contaMPorE.set(i, temp1);
                        Estado temp2 = auxEstados.get(j);
                        auxEstados.set(j, auxEstados.get(i));
                        auxEstados.set(i, temp2);
                    }
                }
            }
            System.out.println("""
                                       Estados listados em ordem decrescente e em quantidade de municípios
                                       """);
            for (int i = 0; i < auxEstados.size(); i++) {
                System.out.println("Estado: " + auxEstados.get(i).getCod() + "," + auxEstados.get(i).getNome() + "," + auxEstados.get(i).getSigla() + ", municípios contidos no estado: " + contaMPorE.get(i));
                int comparador = auxEstados.get(i).getCod();
                for (int i2 = 0; i2 < auxCidades.size(); i2++) {
                    if (auxCidades.get(i).getUf() == comparador) {
                        
                    }
                }
            }
        }
    }

}
