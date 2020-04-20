package ProiectJavaATM;


public class ATM {

    private Bank bank;
    private Card card;


    public ATM(Bank bank, Card card) {
        this.bank = bank;
        this.card = card;
    }

    public void changePin(String oldPin, String newPin) {
        Transaction tran = new ChangePin(oldPin, newPin, bank.getAccountByCardld(this.card.getCardId()));
        System.out.println(bank.executeTrasaction(tran));
    }

    public void withdraw(double amount) {

        Transaction tran = new WithdrawMoney(amount, bank.getAccountByCardld(this.card.getCardId()));
        System.out.println(bank.executeTrasaction(tran));
    }

    public void checkMoney() {
        Transaction tran = new CheckMoney(bank.getAccountByCardld(this.card.getCardId()));
        System.out.println(bank.executeTrasaction(tran));
    }

    public void insertMoney(double amount) {
        Transaction tran = new InsertMoney(amount, bank.getAccountByCardld(this.card.getCardId()));
        System.out.println(bank.executeTrasaction(tran));
    }

    public void transferMoney(double amount, Account beneficiaryAccount) {
        Transaction tran = new TransferMoneySender(amount, bank.getAccountByCardld(this.card.getCardId()));
        System.out.println(bank.executeTrasaction(tran));

        tran = new TransferMoneyReceiver(amount, beneficiaryAccount);
        System.out.println(tran);
    }

    public void payInvoices(String invoicesType, DataInvoices dataInvoices){
        Transaction tran = new PayInvoices(bank.getAccountByCardld(this.card.getCardId()),invoicesType,dataInvoices);
        tran.execute();
        System.out.println(dataInvoices.getGassConsumedCost(bank.getAccountByCardld(this.card.getCardId())));
    }

    public boolean insertCard(Card card, String pin) {

        if (bank.getAccountByCardld(card.getCardId()) != null) {
            if (card.getPin().equals(pin)) {
                this.card = card;
                System.out.println("Card succsesfully entered");
                return true;
            }

        }
        return false;
    }

    public void removeCard() {
        this.card = null;
    }

    public boolean getCard() {
        return this.card != null;
    }

}
