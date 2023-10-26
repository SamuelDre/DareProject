package Exercise;

import Exercise.NameClass;

import java.util.Scanner;

public class NameCLassTest {
    public static void main(String[] args){
        NameClass nameClass = new NameClass();
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the name: ");
        String theName = scanner.nextLine();
        nameClass.setName(theName);
        System.out.printf("%nname in nameClass is: %s%n", nameClass.getName());

    }

}
