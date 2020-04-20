package ProiectJavaATM;

import java.util.ArrayList;

public class Bank {

    public ArrayList<Account> listAccount = new ArrayList<>();
    private int numberOfAccounts;

    public Bank(ArrayList<Account> account, int numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
        listAccount.addAll(account);
    }

    public String executeTrasaction(Transaction t) {
        return t.execute();
    }

    public Account getAccountByCardld(String cardld) {
        for (int i = 0; i < numberOfAccounts; i++) {
            if (this.listAccount.get(i).getCard().getCardId().equals(cardld)) {
                return this.listAccount.get(i);
            }
        }
        return null;
    }

}