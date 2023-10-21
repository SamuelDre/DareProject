package WithdrawalAccount;

public class Account {
    private String name;
    private double balance;
    public Account(String name, double balance) {
        this.name = name;
        if (balance > 0.0){
            this.balance = balance;
        }
    }
    public void setWithdrawalAmount(double withdrawalAmount) {
        if (withdrawalAmount < 0){
            System.out.println("withdrawal amount less than 0");
        } else if (withdrawalAmount < balance) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("Withdrawal amount exceeded account balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }
}


