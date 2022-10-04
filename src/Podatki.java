import java.util.Scanner;

public class Podatki {
    public static void main(String[] args){

        double tax1 = 0.04;
        double tax2 = 0.02;
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj cenę produktu w zł: ");
        double price = klawiatura.nextDouble();
        double price1 = price * 0.04;
        double price2 = price * 0.02;
        double price3 = price + price1 + price2;
        System.out.println("Podatek stanowy: " + price1);
        System.out.println("Podatek lokalny: " + price2);
        System.out.println("Cena sprzedaży: " + price3);



    }

}
