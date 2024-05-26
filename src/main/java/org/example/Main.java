package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
//        items.add(new Item("Apple", "12345", 100, 0.1f));
        items.add(new Item("Banana", "67890", 200, 0));
//        items.add(new Item("Cherry", "01234", 350, 0.2f));


        int payment = 500;

        boolean result = SILab2.checkCart(items, payment);

        System.out.println("Can the payment be accepted? " + result);
    }
}