package ProiectJavaATM;

public class ChangePin extends Transaction {
    public String oldPin;
    public String newPin;

    public ChangePin(String oldPin, String newPin, Account account) {
        this.oldPin = oldPin;
        this.newPin = newPin;
        this.account = account;
    }

    public String execute() {
        if (oldPin.equals(account.getCard().getPin())) {
            account.getCard().setPin(newPin);
            return "Pin changed!";
        } else {
            return "Invalid Pin";
        }
    }
}

