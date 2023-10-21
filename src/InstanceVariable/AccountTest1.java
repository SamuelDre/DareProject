package InstanceVariable;

import java.util.Scanner;
import java.util.Scanner;
public class AccountTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account myAccount = new Account();
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());
        System.out.println("Jane Green");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

    }
}
