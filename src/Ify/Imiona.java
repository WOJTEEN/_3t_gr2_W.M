package Ify;

import java.util.*;

public class Imiona {

    public static void main(String[] args) {
        String name, name2 , name3;

        Scanner klawisz = new Scanner(System.in);
        System.out.println("Podaj 1 imię ");
         name = klawisz.nextLine();

        System.out.println("Podaj 2 imię ");
         name2 = klawisz.nextLine();

        System.out.println("Podaj 3 imię ");
        name3 = klawisz.nextLine();

        List<String> names = new ArrayList<>();
        names.add(name);
        names.add(name2);
        names.add(name3);
        Collections.sort(names);
        for (String person : names){
            System.out .println(person);

        }



    }
}
