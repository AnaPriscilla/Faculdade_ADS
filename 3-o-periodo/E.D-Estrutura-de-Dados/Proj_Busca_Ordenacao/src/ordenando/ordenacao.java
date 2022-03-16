/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenando;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

public class ordenacao {

    public static void main(String[] args) {
        File arquivoDesordenado = new File("src\\dicionarios\\frutas.txt");
        File arquivoOrdenado = new File("src\\dicionarios\\frutas.txt");

        int[] valores = lerDados(arquivoDesordenado);

        ordenar(valores);
        escreverDados(arquivoOrdenado, valores);
    }

    private static int[] lerDados(File arquivo) {
        Pattern pattern = Pattern.compile("\\d");

        StringBuilder buffer = new StringBuilder();
        String[] auxiliar;
        int[] resultado;

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;

            /*
             * Lê os dados do arquivo adicionando apenas as linhas numéricas no
             * buffer (um número por linha).
             */
            while ((linha = reader.readLine()) != null) {
                if (pattern.matcher(linha).matches()) {
                    buffer.append(linha).append("\n");
                } else {
                    System.out.println("[ A ]: Ignorando linha corrompida: '" + linha + "'");
                }
            }
        } catch (IOException e) {
        }

        /*
         * Passa os dados do buffer para um vetor auxiliar de strings, em
         * seguida passa para o vetor correto de int.
         */
        auxiliar = buffer.toString().split("\n");
        resultado = new int[auxiliar.length];

        for (int i = 0; i < auxiliar.length; i++) {
            resultado[i] = Integer.parseInt(auxiliar[i]);
        }

        return resultado;
    }

    private static void escreverDados(File arquivo, int[] valores) {
        StringBuilder buffer = new StringBuilder();

        for (int i : valores) {
            buffer.append(i).append("\n");
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            writer.write(buffer.toString());
        } catch (IOException e) {
        }
    }

    private static void ordenar(int[] valores) {
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores.length - 1; j++) {
                if (valores[j] > valores[j + 1]) {
                    int temp = valores[j];
                    valores[j] = valores[j + 1];
                    valores[j + 1] = temp;
                }
            }
        }
    }
}