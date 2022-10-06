package Ify;

import java.util.Scanner;

public class Oceny {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj ilosc uzsykanych punktów  z 1 testu: ");
        double number = keyboard.nextDouble();
        Scanner keyboard2= new Scanner(System.in);
        System.out.println("Podaj ilosc uzsykanych punktów  z 2 testu: ");
        double number1 = keyboard2.nextDouble();
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Podaj ilosc uzsykanych punktów  z 3 testu: ");
        double number2 = keyboard3.nextDouble();
        if((number > 100 || number < 0) || (number1 > 100 || number1 < 0) || (number2 > 100 || number2 < 0) ) {
            System.out.println("Podałeś złe wyniki!!");
        }
        else {

            double average = (number+number1+number2)/3;
            if(average <= 100 && average > 89){
                System.out.println("Otrzymałeś 5");
            }
           if(average < 90 && average > 79 ){
                System.out.println("Otrzymałeś 4");
            }
            if(average < 80 && average > 69){
                System.out.println("Otrzymałeś 3");
            }
           if(average < 70 && average > 59){
                System.out.println("Otrzymałeś 2");
            }
            if(average < 59){
                System.out.println("Otrzymałeś 1, Popraw się nieuku!!!");
            }

        }
  }
}
