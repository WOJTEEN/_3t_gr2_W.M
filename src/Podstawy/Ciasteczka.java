package Podstawy;

import java.util.Scanner;

public class Ciasteczka {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilosc zjedzonych ciasteczek: ");
        double cookies = keyboard.nextDouble();
        double portion = 0.25 * cookies;
        double calory = 300 * portion;
        System.out.println("Ilosc zjedzonych kalorii to : " + calory);

    }

}
