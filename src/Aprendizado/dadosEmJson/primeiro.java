package Aprendizado.dadosEmJson;

import java.io.FileWriter;
import java.io.IOException;

public class primeiro {

    // 1. Crie um programa em Java que escreva a seguinte mensagem em um arquivo
    // chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo." Utilize as
    // classes do pacote java.io.

    public static void main(String[] args) {
        String data = "Conteúdo a ser gravado no arquivo.";
        try (FileWriter escrita = new FileWriter("arquivo.txt")) {
            escrita.write(data);
            System.out.println("Dados gravados com sucesso.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}