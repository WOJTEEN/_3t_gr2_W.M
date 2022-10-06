package Ify;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Transport {

    public static void main(String[] args) {
        double weight, longs;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź ilość kilometrów: ");
        longs = keyboard.nextDouble();
        System.out.println("Wprowadź wagę przesyłki: ");
        weight = keyboard.nextDouble();
        if (longs > 500) {
            double longs2 = longs % 500;
            if (longs2 == 0) {
                double price = longs / 500;
                if(weight <= 1){
                    double price1 = 1.10 * price;
                    BigDecimal bd = new BigDecimal(price1).setScale(2, RoundingMode.HALF_UP);
                    price1 = bd.doubleValue();
                    System.out.println("Cena to: " + price1 + "zł");
                }
                if(weight > 1 && weight <=3 ){
                    double price1 = 2.20 * price;
                    BigDecimal bd = new BigDecimal(price1).setScale(2, RoundingMode.HALF_UP);
                    price1 = bd.doubleValue();
                    System.out.println("Cena to: " + price1 + "zł");
                }
                if(weight > 3 && weight <=5 ){
                    double price1 = 3.70 * price;
                    BigDecimal bd = new BigDecimal(price1).setScale(2, RoundingMode.HALF_UP);
                    price1 = bd.doubleValue();
                    System.out.println("Cena to: " + price1 + "zł");
                }
                if(weight > 5){
                    double price1 = 3.80 * price;
                    BigDecimal bd = new BigDecimal(price1).setScale(2, RoundingMode.HALF_UP);
                    price1 = bd.doubleValue();
                    System.out.println("Cena to: " + price1 + "zł");
                }
            }


        } else {
            if(weight <= 1){
                double price = 1.10;
                System.out.println("Cena to: " + price + "zł");
            }
            if(weight > 1 && weight <=3 ){
                double price = 2.20;
                System.out.println("Cena to: " + price + "zł");
            }
            if(weight > 3 && weight <=5 ){
                double price = 3.70;
                System.out.println("Cena to: " + price + "zł");
            }
            if(weight > 5){
                double price = 3.80;
                System.out.println("Cena to: " + price + "zł");
            }

        }


    }
}
