import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta:");
        int conta = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha pendente
        System.out.println("Por favor, digite o número da agencia:");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();
        System.out.println("Gostaria de depositar algum valor: ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá. " + nomeCliente + ". Obrigado por criar uma conta em nosso banco.");
        System.out.println("Agencia: " + agencia + " | Número de conta: " + conta);
        System.out.println("Seu saldo de R$: " + saldo);
        System.out.println("Está disponível para saque. Invista em um lindo dia.");
        scanner.close();            
        }
}