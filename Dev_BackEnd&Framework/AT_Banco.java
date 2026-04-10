import java.util.Scanner;

public class AT_Banco {

    static Scanner sc = new Scanner(System.in);
    static double saldo = 1000.0;

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    Saque();
                    break;
                case 2:
                    Deposito();
                    break;
                case 3:
                    Saldo();
                    break;
                case 4:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1 - Saque");
        System.out.println("2 - Depósito");
        System.out.println("3 - Consulta");
        System.out.println("4 - Sair");
        System.out.print("Escolha: ");
    }

    static void Saque() {
        System.out.print("Valor do saque: ");
        double valor = sc.nextDouble();

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    static void Deposito() {
        System.out.print("Valor do depósito: ");
        double valor = sc.nextDouble();

        saldo += valor;
        System.out.println("Depósito realizado!");
    }

    static void Saldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}