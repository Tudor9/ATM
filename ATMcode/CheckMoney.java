package ProiectJavaATM;

public class CheckMoney extends Transaction {
    public CheckMoney(Account account) {
        this.account = account;
    }

    public String execute() {
        return "Your current money is " + account.getBalance();
    }
}
