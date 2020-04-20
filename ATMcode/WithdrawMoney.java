package ProiectJavaATM;

public class WithdrawMoney extends Transaction {
    private double amount;
    private double totalBalance;

    public WithdrawMoney(double amount, Account account) {
        this.amount = amount;
        this.totalBalance = account.getBalance();
        this.account = account;
    }

    public String execute() {
        if (totalBalance > this.amount) {
            totalBalance -= this.amount;
            account.setBalance(totalBalance);
            return "Your total balance is: " + account.getBalance() + "\nPlease take your money: " + this.amount;
        } else {
            return "You don't have enough money to withdraw them";
        }
    }

}
