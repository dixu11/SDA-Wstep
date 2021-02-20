package wstep2;

import java.util.Scanner;

class Petle {

    public static void main(String[] args) {
        int punkty = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ile punktów chcesz zliczyć?");
        int iloscKategorii = scanner.nextInt();
        int licznik = 0;

        while (licznik < iloscKategorii){
            System.out.println("Podaj otrzymaną ilość punktów");
            punkty = punkty + scanner.nextInt();
            licznik = licznik + 1;
        }

        System.out.println("Ostateczny wynik: ");
        System.out.println("Otrzymałeś " + punkty + " punkty");
    }


}
