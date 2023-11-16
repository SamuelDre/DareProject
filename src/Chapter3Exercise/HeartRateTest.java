package Chapter3Exercise;
import java.util.Scanner;

public class HeartRateTest {
    public static void main(String[] args){
        HeartRate heartRate = new HeartRate("Jane", "Green", 03, 06, 2001);
        System.out.printf("customer name is %s %s%n", heartRate.getFirstName(), heartRate.getLastName());
        System.out.printf("Date of birth %d:%d:%d%n", heartRate.getMonthOfBirth(), heartRate.getDayOfBirth(), heartRate.getYearOfBirth());
        System.out.printf("current year :%d%n", heartRate.getCurrentYear());

        System.out.printf("Age:%d years%n", heartRate.getAgeInYears());
        System.out.printf("maximum heart rate:%d%n", heartRate.getMaximumHeartRate());
        System.out.printf("target heart rate: %.2f", heartRate.getTargetHeartRate());



    }
}
