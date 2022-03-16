package lerCaractere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author User
 */
public class Caractere {
    
    /*
    public static void main(String[] args) {
    
    }*/

    public void chamada() {         
        criaMatriz(loadArquivo());
    }

    private List<String> loadArquivo() {

        List<String> conteudo = new ArrayList<String>();

        try {
            String File;
            BufferedReader in = new BufferedReader(new FileReader(""));
            String str;

            while ((str = in.readLine()) != null) {
                conteudo.add(str);
            }
            in.close();
        } catch (IOException ioe) {
            System.out.println(ioe);
        }

        return conteudo;
    }

    private String[][] criaMatriz(List<String> conteudo) {
        //pelo conteudo pego o n° dfe linhas para a matriz
        int linha = conteudo.size();
        int coluna = 0;

        //pego o n° de colunas da matriz pela 1ª linha
        if (conteudo.get(0).contains("|")) {
            String s = conteudo.get(0);
            for (int j = 0; j < s.length(); j++) {
                Character c = s.charAt(j);
                if (c.equals('|')) {
                    coluna++;
                }
            }
        }

        //como o n° de colunas eh 1 menos | vamos diminuir um na coluna
        coluna = coluna - 1;
        String[][] matriz = new String[linha][coluna];

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = "";
                String s = conteudo.get(i);
                for (int x = 0; x < s.length(); x++) {
                    Character caracter = s.charAt(x);
                    if (!caracter.equals('|')) {
                        matriz[i][j] += caracter.toString();
                    } else if (x != 0 && j < coluna - 1) {
                        j++;
                        matriz[i][j] = "";
                    }
                }

            }
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
        return matriz;
    }

}