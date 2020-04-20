package ProiectJavaATM;

public class InsertMoney extends Transaction{

    private double amount;
    private double totalBalance;

    public InsertMoney(double amount, Account account){
        this.amount = amount;
        this.account = account;
        this.totalBalance = account.getBalance();
    }

    public String execute() {
        this.totalBalance += this.amount;
        account.setBalance(this.totalBalance);
        return "Your total balance is = "+ account.getBalance();
    }
}
