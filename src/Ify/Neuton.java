package Ify;

import java.util.Scanner;

public class Neuton {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj masę: ");
        double mass = keyboard.nextDouble();
        double weight = mass * 9.8;
        if(weight > 1000){
            System.out.println("Obiekt jest zbyt ciężki!!");

        }
        if(weight < 10){
            System.out.println("Obiekt jest zbyt lekki!!");

        }
    }


    }
