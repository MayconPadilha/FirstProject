package banco;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome = "Maycon Padilha";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        int opcao = 0;
        while (opcao != 4) {

            System.out.println(String.format("""
                    ***********************
                    Dados iniciais do cliente:

                    Nome: %s
                    Tipo conta: %s
                    Saldo inicial: R$ %.2f
                    ***********************
                    """, nome, tipoConta, saldo));

            System.out.print("""
                    Operações

                    1- Consultar saldos
                    2- Receber valor
                    3- Transferir valor
                    4- Sair

                    Digite a opção desejada:
                    """);

            opcao = scan.nextInt();
            clearConsole();

            switch (opcao) {
                case 1:
                    System.out.println("***********************");
                    System.out.println("Seu saldo é de: " + saldo);
                    System.out.println("***********************");
                    break;

                case 2:
                    System.out.println("***********************");
                    System.out.print("Informe o valor a receber: ");
                    double valor = scan.nextDouble();
                    System.out.println("***********************");

                    saldo += valor;
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;
                case 3:
                    System.out.println("***********************");
                    System.out.print("Informe o valor a transferir: ");
                    double valorTransferir = scan.nextDouble();

                    if (valorTransferir > saldo) {
                        System.out.println("Não há saldo suficiente para fazer essa transferência.");
                        break;
                    } else {
                        System.out.println("***********************");
                        saldo -= valorTransferir;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    }
                    break;
                case 4:
                    opcao = 4;
                    scan.close();
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
