package Chapter3Exercise;

public class HeartRate {
    private String firstName;
    private String lastName;
    private int monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private int ageInYears;
    private int maximumHeartRate;
    private double targetHeartRate;
    private int currentYear=2023;
    private int beats=220;
    public HeartRate(String firstName, String lastName, int monthOfBirth,  int dayOfBirth,int  yearOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth =dayOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

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
    public void setAgeInYears(int ageInYears){
        ageInYears = currentYear - yearOfBirth;
        this.ageInYears = ageInYears;
    }
    public int getAgeInYears(){
        return ageInYears;
    }

    public int getMaximumHeartRate() {
        return maximumHeartRate;
    }

    public void setMaximumHeartRate(int maximumHeartRate) {
        maximumHeartRate = beats - ageInYears;
        this.maximumHeartRate = maximumHeartRate;
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
}
