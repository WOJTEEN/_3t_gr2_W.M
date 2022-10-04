package zaokraglanie;

public class Napoje {

    public static void main(String[] args){

        double persons = 12467;
        double price1 = persons * 0.14;
        price1 = Math.round(price1);
        double price2 = persons * 0.64;
        price2 = Math.round(price2);
        System.out.println("Ludzie pijący przynajmniej 1 napój: " + (int)price1);
        System.out.println("Ludzie preferujący smak cytrusowy: " + (int)price2);





    }

}
