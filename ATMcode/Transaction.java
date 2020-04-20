package ProiectJavaATM;

abstract class Transaction {
    public Account account;

    public abstract String execute();

}
