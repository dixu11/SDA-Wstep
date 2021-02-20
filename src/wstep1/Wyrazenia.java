package wstep1;

import java.util.Scanner;

public class Wyrazenia {

    public static void main(String[] args) {
       // System.out.println(123 + 10);
       // System.out.println("123abc" + "10abc" + true + false + 2345.34 + 'a');

        System.out.println(6 / 4); // int i int -> int
        System.out.println(6 / 4.0); // double i int -> double

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj cene produktu 1");
        double cenaProduktu1= scanner.nextDouble();
        System.out.println("Podaj cene produktu 2");
        double cenaProduktu2 = scanner.nextDouble();

        double suma = cenaProduktu1 + cenaProduktu2;
        double podatek = suma * 0.1;

        System.out.println("Laczna cena to: " + suma);
        System.out.println("Podatek z tej ceny to: " + podatek + "zł");

    }

}
