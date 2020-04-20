package ProiectJavaATM;

public class TransferMoneyReceiver extends Transaction{
    private double amount;
    private double totalBalance;

    public TransferMoneyReceiver(double amount, Account beneficiaryAccount){
        this.account = beneficiaryAccount;
        this.amount = amount;
        this.totalBalance = account.getBalance();
    }

    @Override
    public String execute() {
        this.totalBalance += this.amount;
        account.setBalance(this.totalBalance);
        return "Successful transfer";
    }
}
