package org.example;

import java.util.List;

public class SILab2 {
    public static boolean checkCart(List<Item> allItems, int payment) { //A

        if (allItems == null) { //B
            throw new RuntimeException("allItems list can't be null!");//C
        }

        float sum = 0;//D


        for (int i = 0; i < allItems.size(); i++) {//E.1 E.2 E.3
            Item item = allItems.get(i);//F


            if (item.getName() == null || item.getName().length() == 0) { //G
                item.setName("unknown"); //H
            }


            if (item.getBarcode() != null) { //I
                String allowed = "0123456789"; //J
                char[] chars = item.getBarcode().toCharArray(); //K


                for (int j = 0; j < item.getBarcode().length(); j++) { //L.1 L.2 L.3
                    char c = item.getBarcode().charAt(j); //M
                    if (allowed.indexOf(c) == -1) { //N
                        throw new RuntimeException("Invalid character in item barcode!"); //0
                    }
                }


                if (item.getDiscount() > 0) { //P
                    sum += item.getPrice() * item.getDiscount(); //Q
                } else {
                    sum += item.getPrice(); //R
                }
            } else {
                throw new RuntimeException("No barcode!"); //S
            }


            if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0') { //T
                sum -= 30; //U
            }
        }


        if (sum <= payment) { //V
            return true; //W
        } else {
            return false; //X
        }
    }
}
