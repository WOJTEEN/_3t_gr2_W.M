package Podstawy;

public class Pomieszczenia {
    public static void main(String[] args){

        int room1 = 3 * 4;
        int room2 = room1;
        int room3 = 3 * 2;
        int room4 = 2 * 2;
        int area = room1 + room2 + room3 + room4;
        int person = 4;
        double spaceforperson;
         spaceforperson  = (double)area/person;
        System.out.print("1 pokój: " + room1 +"\n");
        System.out.print("2 pokój: " + room2 +"\n");
        System.out.print("3 pokój: " + room3 +"\n");
        System.out.print("4 pokój: " + room4 +"\n");
        System.out.print("Całkowita powierzchnia to: " + area +"\n");
        System.out.print("Powierzchnia na osobę: " + spaceforperson +"\n");






    }

}
