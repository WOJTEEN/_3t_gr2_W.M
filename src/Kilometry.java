import java.util.Scanner;

public class Kilometry {
        public static void main(String[] args){

            double tax1 = 0.04;
            double tax2 = 0.02;
            Scanner klawiatura = new Scanner(System.in);
            System.out.println("Podaj przejechane kilometry: ");
            double kilometers1 = klawiatura.nextDouble();
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Podaj wykorzystane litry paliwa: ");
            double fuel = keyboard.nextDouble();
            double kilometers2 = kilometers1/fuel;
            System.out.println("Przejechane kilometry to: " + kilometers2);




        }


}
