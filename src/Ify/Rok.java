package Ify;

import java.util.Scanner;

public class Rok {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dzień: ");
        int day = keyboard.nextInt();
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Podaj Miesiąc: ");
        int month = keyboard1.nextInt();
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Podaj Rok: ");
        int year = keyboard2.nextInt();

        if (day > 31) {
            System.out.println("Podałeś zły dzień ");
             System.exit(0);
        } else if (day < 1) {
            System.out.println("Podałeś zły dzień ");
             System.exit(0);
        }
        if (month > 12) {
            System.out.println("Podałeś zły miesiąc ");
             System.exit(0);
        } else if (month < 1) {
            System.out.println("Podałeś zły miesiąc");
             System.exit(0);
        }
            int suma = day * month;
            if (suma == year) {
                System.out.println("Brawo trafiłeś na magiczną liczbę!");
            } else {
                System.out.println("Pudło!");

            }
        }
    }
