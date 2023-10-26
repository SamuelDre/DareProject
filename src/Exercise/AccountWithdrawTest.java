package Exercise;
import java.util.Scanner;
public class AccountWithdrawTest {
    public static void main(String[] args){
        AccountWithdraw accountWithdraw = new AccountWithdraw("Jane Green", 2000);
        System.out.printf("%s balance:%.2f%n", accountWithdraw.getName(), accountWithdraw.getBalance());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter withdraw amount:");
        double withdrawAmount = scanner.nextDouble();
        System.out.printf("%nwithdrawing %.2f from account balance%n", withdrawAmount);
        accountWithdraw.withdraw(withdrawAmount);
        System.out.printf("%n%s balance:%.2f", accountWithdraw.getName(), accountWithdraw.getBalance());
    }
}
