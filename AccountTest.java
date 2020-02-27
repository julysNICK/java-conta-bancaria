
import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args) {
        Account account1 = new Account("julys", 50.00);
        Account account2 = new Account("Martins", -7.53);
        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("entre com a conta inicial da conta1");
        double depositAmount = input.nextDouble();

        System.out.printf("%nadicionando  ï%.2f to account1 balanço%n%n", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1

        // exibe os saldos
        System.out.printf("%s balance: $%.2f  %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f  %n%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); // promp
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("%nadding ï%.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2
        System.out.printf("%s balance: $%.2f  %n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f  %n%n", account2.getName(), account2.getBalance());

    }
}