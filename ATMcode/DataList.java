package ProiectJavaATM;

import java.util.ArrayList;

public class DataList {

    ArrayList<Account> a = new ArrayList<>();
    ArrayList<Card> c = new ArrayList<>();

    public void addData(){

        c.add(0, new Card("19990", "1234"));
        a.add(0, new Account("George", 322.5, c.get(0)));

        c.add(1, new Card("19991", "2312"));
        a.add(1, new Account("Tudor", 4432.38, c.get(1)));

        c.add(2, new Card("19992", "1122"));
        a.add(2, new Account("Andreea", 2654.50, c.get(2)));

        c.add(3, new Card("19993", "5901"));
        a.add(3, new Account("Maria", 16545.80, c.get(3)));

        c.add(4, new Card("19994", "3894"));
        a.add(4, new Account("Ilinca", 3500.23, c.get(4)));

        c.add(5, new Card("19995", "5501"));
        a.add(5, new Account("Bogdan", 4324.78, c.get(5)));

        c.add(6, new Card("19996", "2231"));
        a.add(6, new Account("Flaviu", 5432.99, c.get(6)));

        c.add(7, new Card("19997", "3308"));
        a.add(7, new Account("Andrei", 7865.32, c.get(7)));

        c.add(8, new Card("19998", "7644"));
        a.add(8, new Account("Cristian", 7576.13, c.get(8)));

        c.add(9, new Card("19999", "9312"));
        a.add(9, new Account("Greta", 6244.54, c.get(9)));

    }

}
