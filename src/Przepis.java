import java.util.Scanner;

public class Przepis {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę ciastek: ");
        double cookies = keyboard.nextDouble();
        double glass3 = cookies * 0.057;
        double glass2 = cookies * 0.02;
        double glass1 = cookies * 0.03;
        System.out.println("Liczba szklanek cukru: " + glass1);
        System.out.println("Liczba szklanek masła: " + glass2);
        System.out.println("Liczba szklanek mąki: " + glass3);





    }

}
