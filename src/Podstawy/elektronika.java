package Podstawy;

import java.util.Scanner;

public class elektronika {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj Cene deataliczną: ");
        double cena = keyboard.nextDouble();
        double profit = cena * 0.4;
        System.out.println("Zysk wynosi: " + profit);

    }
}
