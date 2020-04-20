package ProiectJavaATM;

import java.util.Scanner;

//I have made a real time accessing ATM bank where users can interact with it from the console

public class Main {

    public static void main(String[] args) {

        int x, cardNumber;
        double amount;
        String oldPin, newPin, pin, beneficiaryId, invoiceType;
        boolean infinitCicle = true;

        Scanner scanner = new Scanner(System.in);

        DataList dataList = new DataList();
        dataList.addData();

        DataInvoices dataInvoices = new DataInvoices(dataList);
        dataInvoices.addData();

        Bank b = new Bank(dataList.a, dataList.a.size());

        ATM ATM = new ATM(b, null);


        while (infinitCicle) { //this is an infinite cycle for real time accessing the ATM
            //Here the ATM is telling you that you need to insert the card number. Each card has a number between 0 and 9
            System.out.println("Insert card");
            cardNumber = scanner.nextInt();
            System.out.println("Insert pin");
            pin = scanner.next();
            //Here is the verification for the data entered
            if (ATM.insertCard(dataList.c.get(cardNumber), pin)) {
                ATM = new ATM(b, dataList.c.get(cardNumber));
            } else {
                System.out.println("Wrong pin!");
            }

            while (ATM.getCard()) { //ATM.getCard is a boolean method that returns true when a card is inside the ATM and respectively false when a card isn't inside the ATM
                System.out.println("1.Withdraw 2.Insert 3.ChangePin 4.CheckMoney 5.CheckPersonalData 6.Transfer 7.PayInvoices 8.ExitATM 9.ExitProgram");
                x = scanner.nextInt();
                switch (x) {
                    case 1: {
                        System.out.println("Introduce amount");
                        amount = scanner.nextDouble();
                        ATM.withdraw(amount);
                        break;
                    }
                    case 2: {
                        System.out.println("Introduce amount");
                        amount = scanner.nextDouble();
                        if (amount > 0) {
                            ATM.insertMoney(amount);
                        } else {
                            System.out.println("You can't introduce negative numbers");
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Introduce old pin: ");
                        oldPin = scanner.next();
                        System.out.println("Introduce new pin: ");
                        newPin = scanner.next();
                        ATM.changePin(oldPin, newPin);
                        break;
                    }
                    case 4: {
                        ATM.checkMoney();
                        break;
                    }
                    case 5: {
                        System.out.println(b.toString());
                    }
                    case 6: {
                        System.out.println("Introduce amount ");
                        amount = scanner.nextDouble();
                        if (amount > 0) {
                            System.out.println("Introduce beneficiary id ");
                            beneficiaryId = scanner.next();
                            ATM.transferMoney(amount, b.getAccountByCardld(beneficiaryId));
                        } else {
                            System.out.println("You can't introduce negative numbers");
                        }
                        break;
                    }
                    case 7: {
                        System.out.println("enter the type of invoice");
                        invoiceType = scanner.next();
                        ATM.payInvoices(invoiceType, dataInvoices);
                        break;
                    }
                    case 8: {
                        ATM.removeCard();
                        System.out.println("Card removed");
                        break;
                    }
                    case 9: {
                        ATM.removeCard();
                        infinitCicle = false;
                        break;
                    }
                    default: {
                        System.out.println("Wrong command");
                    }
                }
            }
        }
    }
}
