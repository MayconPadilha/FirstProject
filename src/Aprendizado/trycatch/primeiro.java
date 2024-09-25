package Aprendizado.trycatch;

import java.util.Scanner;

public class primeiro {

    // 1. Crie um programa simples que solicita dois números ao usuário e realiza a
    // divisão do primeiro pelo segundo. Utilize o bloco try/catch para tratar a
    // exceção que pode ocorrer caso o usuário informe 0 como divisor.

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitura.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitura.nextInt();

        try {
            int divisao = num1 / num2;
            System.out.println("O resultado da divisão é: " + divisao);
        } catch (ArithmeticException e) {
            System.out.println("Impossível dividir por zero");
        }

    }

}
