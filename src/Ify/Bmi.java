package Ify;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wagę w kg: ");
        double weight = keyboard.nextDouble();

        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Podaj wzrost w m: ");
        double growth = keyboard1.nextDouble();

        double bmi = weight/(growth * growth);
        if(bmi < 18.5){

            System.out.println("Masz niedowagę! Przytyj!");
            System.exit(0);
        }  if (bmi > 25.0 ) {
            System.out.println("Masz nadwagę! Schudnij!");
            System.exit(0);
        }
        else {

            System.out.println("Masz odpowiednią wagę! Gratulacje!");

        }


    }


    }
