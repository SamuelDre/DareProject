package WithdrawalAccount;


import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Account account = new Account("Jane Green", 50.00);

        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter withdrawal amount for account: ");
        double withdrawalAmount = input.nextDouble();
        System.out.printf("%nwithdraw %.2f from account balance%n%n", withdrawalAmount);
        account.setWithdrawalAmount(withdrawalAmount);
        System.out.printf("%s balance: $%.2f%n", account.getName(), account.getBalance());

    }
}
