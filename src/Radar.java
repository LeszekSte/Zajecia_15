import java.util.Scanner;
import java.util.SortedMap;

public class Radar {
    public static void main(String[] args) {
        System.out.println("Dostępne predkości");
        MxFast[] fasts = MxFast.values();

        for (MxFast fast : fasts) {
            System.out.println(fast);
        }
        System.out.println("Z jaką prędkością jedziesz ?");
        Scanner scanner = new Scanner(System.in);
        String odp = scanner.nextLine().toUpperCase();

//        MxFast opis1 = MxFast.valueOf(odp);
//        System.out.printf("Poruszasz sie z prędkością %s, która wynosi %s\n", opis1, opis1.getOpis());
//        opis1.printFast();

        for (MxFast fast : fasts) {
            if (fast.getV() == (Integer.valueOf(odp))) {
                if (fast.getV() == (Integer.parseInt(odp))) {
                    ;
                    System.out.println(fast.name());
                }
            }
        }


    }}