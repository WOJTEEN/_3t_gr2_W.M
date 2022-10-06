package Ify;

import java.util.Scanner;

public class Liczba {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 10: ");
        double number = keyboard.nextDouble();
        if (number > 10){
            System.out.println("Podałeś złą liczbę");

        } else if (number < 1) {
            System.out.println("Podałeś złą liczbę");

        } else {
            if (number == 1){
                System.out.println("Liczba rzymska to: I");
            }
            if (number == 2){
                System.out.println("Liczba rzymska to: II");
            }
            if (number == 3){
                System.out.println("Liczba rzymska to: III");
            }
            if (number == 4){
                System.out.println("Liczba rzymska to: IV");
            }
            if (number == 5){
                System.out.println("Liczba rzymska to: V");
            }
            if (number == 6){
                System.out.println("Liczba rzymska to: VI");
            }
            if (number == 7){
                System.out.println("Liczba rzymska to: VII");
            }
            if (number == 8){
                System.out.println("Liczba rzymska to: VIII");
            }
            if (number == 9){
                System.out.println("Liczba rzymska to: IX");
            }
            if (number == 10){
                System.out.println("Liczba rzymska to: X");
            }



        }



    }

}
