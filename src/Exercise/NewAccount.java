package Exercise;

public class NewAccount {
    private String name;
    private double balance;
    public NewAccount(String name, double balance){
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
    public void deposit(double depositAmount){
        if (depositAmount > 0);
        balance = balance + depositAmount;
    }
}
