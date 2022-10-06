package Podstawy;

import java.util.Scanner;

public class Miasta {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj Nazwę miasta: ");
        String name = keyboard.nextLine();
        int lenght = name.length();
        String big, small;

        big = name.toUpperCase();
        small = name.toLowerCase();
        char firstmark = name.charAt(0);
        System.out.println("Nazwa miasta: " + name + "\n" + "Długość nazwy: " + lenght + "\n" +
                "Wielkie litery: " + big + "\n" + "Małe litery: " + small + "\n" + "Pierwszy znak: " + firstmark);

    }
}
