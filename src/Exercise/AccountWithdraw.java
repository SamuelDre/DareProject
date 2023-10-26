package Exercise;

public class AccountWithdraw {
    private String name;
    private double balance;
    private double withdraw;
    public AccountWithdraw(String name, double balance){
        this.name = name;
        if (balance > 0){
            this.balance = balance;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount < 0) {
            System.out.println("withdrawal amount is negative");
        } else if (withdrawAmount > balance){
            System.out.println("withdrawal amount is exceed");

        } else {
            balance = balance - withdrawAmount;
        }



    }
}
