import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        String agencia, nome;
        double saldo;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Número da agência: ");
        num = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Nome da agência: ");
        agencia = entrada.nextLine();

        System.out.println("Seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Saldo: ");
        saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s," +
                " conta %d e seu saldo %.2f já está disponível para saque!", nome, agencia, num, saldo);

        entrada.close();

    }
}