package Chapter3Exercise;
import java.util.Scanner;
public class CarApplication {
    public static void main(String[] args){
        Car car1 = new Car("good car", "2023", 120000);
        Car car2 = new Car("best car", "2024", 890000);
        System.out.printf("%s %s price: %.2f%n", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%s %s price: %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the discount for car1:");
        double discountAmount = scanner.nextDouble();
        car1.setDiscount(discountAmount);
        System.out.print("Applying discount amount on car1 price");
        System.out.printf("%n%s %s car1 discount price: %.2f", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%n%s %s price: %.2f%n", car2.getModel(), car2.getYear(), car2.getPrice());


        System.out.print("Enter the discount for car2:");
        discountAmount = scanner.nextDouble();
        car2.setDiscount(discountAmount);
        System.out.print("Applying discount amount on car2 price");
        System.out.printf("%n%s %s car2 discount price: %.2f", car2.getModel(), car2.getYear(), car2.getPrice());


        System.out.printf("%n%s %s car1 discount price: %.2f", car1.getModel(), car1.getYear(), car1.getPrice());
        System.out.printf("%n%s %s car2 discount price: %.2f", car2.getModel(), car2.getYear(), car2.getPrice());
    }
}
