import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\f");
        System.out.println("--------------");
        System.out.println("-----Banco----");
        System.out.println("--------------");
       
        System.out.println("Digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Digite o numero da sua conta: ");
        int numConta = input.nextInt();
        System.out.println("Digite o seu saldo atual: ");
        double saldo = input.nextDouble();
        System.out.println("Digite o numero da sua agencia: ");
        int agencia = input.nextInt();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta " + numConta +" e seu saldo "+ saldo +" já está disponível para saque.");

    }
}
