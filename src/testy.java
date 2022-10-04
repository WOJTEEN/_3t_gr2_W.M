import java.util.Scanner;

public class testy {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wynik 1 testu: ");
        double test1 = keyboard.nextDouble();

        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Podaj wynik 2 testu: ");
        double test2 = keyboard1.nextDouble();

        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Podaj wynik 3 testu: ");
        double test3 = keyboard2.nextDouble();
        double srednia = (test1*test3*test2)/3;
        System.out.println("Wynik pierwszego testu to: " + test1);
        System.out.println("Wynik drugiego  testu to: " + test2);
        System.out.println("Wynik trzeciego testu to: " + test3);
        System.out.println("Srednia to: " + srednia);





    }

}
