package Ify;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class Oprogramowanie {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź ilość zakupionych sztuk: ");
        double number = keyboard.nextDouble();
        double price = (99.0 * number);
        if( number < 10 ){
            System.out.println("Cena to: " +(int)price + " zł");
            System.out.println("Brak rabatu");
        }
        if( number > 9 && number < 20 ){
            price = (price * 0.8);
            BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
            price = bd.doubleValue();
            System.out.println("Cena to: " + price + " zł");
            System.out.println("Rabat to 20%");
        }
        if( number > 19 && number < 50 ){
            price = (price * 0.7);
            BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
            price = bd.doubleValue();
            System.out.println("Cena to: " + price + " zł");
            System.out.println("Rabat to 30%");
        }
        if( number > 49 && number < 100 ){
            price = (price * 0.6);
            BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
            price = bd.doubleValue();
            System.out.println("Cena to: " + price + " zł");
            System.out.println("Rabat to 40%");
        }
        if( number > 100){
            price = (price * 0.5);
            BigDecimal bd = new BigDecimal(price).setScale(2, RoundingMode.HALF_UP);
            price = bd.doubleValue();
            System.out.println("Cena to: " + price + " zł");
            System.out.println("Rabat to 50%");
        }




    }

}
