package ProiectJavaATM;

import java.util.Scanner;

public class PayInvoices extends Transaction {

    private double totalBalance;
    private String invoiceType;
    private DataInvoices dataInvoices;
    Scanner scanner = new Scanner(System.in);

    public PayInvoices(Account account, String invoiceType, DataInvoices dataInvoices) {
        this.account = account;
        this.totalBalance = account.getBalance();
        this.invoiceType = invoiceType;
        this.dataInvoices = dataInvoices;
    }


    @Override
    public String execute() {

        switch (invoiceType) {

            case "Gass": {
                int invoicesAmount = dataInvoices.getGassConsumedCost(account);
                System.out.println(invoicesAmount);
                int amount = scanner.nextInt();
                if (amount > 0) {
                    if (amount > account.getBalance()) {
                        return "You don't have enough money to pay";
                    } else {
                        totalBalance -= amount;
                        account.setBalance(totalBalance);
                        dataInvoices.map.get(account).set(0, invoicesAmount - amount);
                        return "Invoice successfully paid";
                    }
                } else {
                    return "You can't introduce negative numbers";
                }
            }

            case "Water": {
                int invoicesAmount = dataInvoices.getWaterConsumedCost(account);
                System.out.println(invoicesAmount);
                int amount = scanner.nextInt();
                if (amount > 0) {
                    if (amount > account.getBalance()) {
                        return "You don't have enough money to pay";
                    } else {
                        totalBalance -= amount;
                        account.setBalance(totalBalance);
                        dataInvoices.map.get(account).set(0, invoicesAmount - amount);
                        return "Invoice successfully paid";
                    }
                } else {
                    return "You can't introduce negative numbers";
                }
            }

            case "Electric": {
                int invoicesAmount = dataInvoices.getElectricConsumedCost(account);
                System.out.println(invoicesAmount);
                int amount = scanner.nextInt();
                if (amount > 0) {
                    if (amount > account.getBalance()) {
                        return "You don't have enough money to pay";
                    } else {
                        totalBalance -= amount;
                        account.setBalance(totalBalance);
                        dataInvoices.map.get(account).set(0, invoicesAmount - amount);
                        return "Invoice successfully paid";
                    }
                } else {
                    return "You can't introduce negative numbers";
                }
            }
            default: {
                return "Wrong option...";
            }
        }
    }
}
