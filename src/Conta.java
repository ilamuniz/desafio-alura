import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Arthur Conan Doyle";
        String tipoConta = "Corrente";
        double saldo = 5699.90;
        int opcao = 0;
        String operacoes = "----- Digite sua escolha: -----\n" +
                "1 - Consultar saldos\n" +
                "2 - Receber valor\n" +
                "3 - Transferir valor\n" +
                "4 - Sair";

        System.out.println("*****************\n");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*****************");

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = leitor.nextInt();
        }
    }
}