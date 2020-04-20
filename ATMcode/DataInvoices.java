package ProiectJavaATM;

import java.util.*;

public class DataInvoices {

    DataList accounts;
    ArrayList<Integer> invoicesDatas = new ArrayList<>(3);
    Map<Account, ArrayList<Integer>> map = new HashMap<>();
    Random rand = new Random();

    public DataInvoices(DataList accounts) {
        this.accounts = accounts;
    }

    public void addData() {

        for (int i = 0; i < accounts.a.size(); i++) {

            int gassConsumedCost = rand.nextInt(600);
            int electricConsumedCost = rand.nextInt(300);
            int waterConsumedCost = rand.nextInt(500);
            invoicesDatas.add(gassConsumedCost);
            invoicesDatas.add(electricConsumedCost);
            invoicesDatas.add(waterConsumedCost);

            map.put(accounts.a.get(i), invoicesDatas);
        }

    }

    public int getGassConsumedCost(Account account) {
        return map.get(account).get(0);
    }

    public int getWaterConsumedCost(Account account) {
        return map.get(account).get(1);
    }

    public int getElectricConsumedCost(Account account) {
        return map.get(account).get(2);
    }
}
