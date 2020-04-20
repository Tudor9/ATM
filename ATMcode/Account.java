package ProiectJavaATM;

public class Account {
    private double balance;
    private Card card;
    private String owner;

    public Account(String owner, Double balance, Card card) {
        this.balance = balance;
        this.card = card;
        this.owner = owner;
    }

    public Card getCard() {
        return card;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "card=" + card +
                ", owner='" + owner + '\'' +
                '}';
    }
}
