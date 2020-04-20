package ProiectJavaATM;

public class TransferMoneySender extends Transaction{
    private double amount;
    private double totalBalance;

    public TransferMoneySender(double amount, Account payerAccount){
        this.account = payerAccount;
        this.amount = amount;
        this.totalBalance = account.getBalance();
    }

    @Override
    public String execute() {
        if (totalBalance > this.amount) {
            totalBalance -= this.amount;
            account.setBalance(totalBalance);
            return "Your total balance is: " + account.getBalance();
        } else {
            return "You don't have enough money to transfer ";
        }

    }
}
