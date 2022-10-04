import java.util.Scanner;

public class Restauracja {

        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Podaj Cene posiłku: ");
                double cena = keyboard.nextDouble();
                double  tax = cena * 0.0675;
                double  tax2 = cena + tax;
                double  tip = tax2 * 0.2;
                double  costs = cena + tax + tip;
                System.out.println(" Cena posiłku: " + cena);
                System.out.println(" Podatek: " + tax);
                System.out.println(" Napiwek: " + tip);
                System.out.println(" Łączna cena: " + costs);





        }
        }
