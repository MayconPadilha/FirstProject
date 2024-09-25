package Aprendizado.DesafioQuatro;

import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe seu cep: ");
        String cep = scan.nextLine();
        scan.close();

        ConsultaCep consultaCep = new ConsultaCep();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
            geradorDeArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
