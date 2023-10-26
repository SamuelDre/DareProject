package Exercise;
import java.util.Scanner;
public class NewAccountTest {
    public static void main(String[] args){
        NewAccount newAccount = new NewAccount("jane green", 560);
        System.out.printf("%s balance:%.2f%n", newAccount.getName(), newAccount.getBalance());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount:");
        double depositAmount = scanner.nextDouble();
        System.out.printf("%nadding %.2f to account balance%n", depositAmount);
        newAccount.deposit(depositAmount);
        System.out.printf("%s account balance is %.2f%n", newAccount.getName(),newAccount.getBalance());

    }

}
