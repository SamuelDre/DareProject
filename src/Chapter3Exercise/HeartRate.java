package Chapter3Exercise;
import java.util.Scanner;
public class HeartRate {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private int ageInYears;
    private int maximumHeartRate;
    private double targetHeartRate;
    private int currentYear;
    private int beats=220;



    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    public void setAgeInYears(int ageYears){
        ageYears = currentYear - yearOfBirth;
        this.ageInYears = ageYears;
    }
    public int getAgeInYears(){
        return ageInYears;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setMaximumHeartRate(int maximumRate) {
        maximumRate = beats - ageInYears;
        this.maximumHeartRate = maximumRate;
    }

    public void setBeats(int beats) {
        this.beats = beats;
    }

    public int getBeats() {
        return beats;
    }

    public int getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(int currentYear) {

        this.currentYear = currentYear;
    }

    public double getTargetHeartRate() {
        return targetHeartRate;
    }

    public void setTargetHeartRate(double targetHeartRate) {
        targetHeartRate = 0.5 * maximumHeartRate;
        this.targetHeartRate = targetHeartRate;
    }

    public static void main(String[] args){
        HeartRate heartRate = new HeartRate();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name:");
        String firstName = scanner.nextLine();
        heartRate.setFirstName(firstName);
        System.out.print("Enter last name:");
        String lastName = scanner.nextLine();
        heartRate.setLastName(lastName);
        System.out.printf("customer name is %s %s%n", heartRate.getFirstName(), heartRate.getLastName());

        System.out.print("Enter month of birth:");
        int monthOfBirth = scanner.nextInt();
        heartRate.setMonthOfBirth(monthOfBirth);
        System.out.print("Enter day of birth:");
        int dayOfBirth = scanner.nextInt();
        heartRate.setDayOfBirth(dayOfBirth);
        System.out.print("Enter year of birth:");
        int yearOfBirth = scanner.nextInt();
        heartRate.setYearOfBirth(yearOfBirth);
        System.out.printf("Date of birth %d:%d:%d%n", heartRate.getMonthOfBirth(), heartRate.getDayOfBirth(), heartRate.getYearOfBirth());

        System.out.print("Enter current year:");
        int currentYear = scanner.nextInt();
        heartRate.setCurrentYear(currentYear);
        System.out.printf("current year :%d%n", heartRate.getCurrentYear());


        System.out.printf("Age:%d years%n", heartRate.getAgeInYears());
        System.out.printf("maximum heart rate:%d%n", heartRate.getMaximumHeartRate());
        System.out.printf("target heart rate: %.2f", heartRate.getTargetHeartRate());
    }
}
