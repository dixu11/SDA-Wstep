package wstep2;

import java.util.Scanner;

class WczytywanieDanych {


    public static void main(String[] args) {
        Scanner wczytywanie = new Scanner(System.in);

        System.out.println("Podaj cene produktu, w złotówkach");
        double cena =  wczytywanie.nextDouble();
        System.out.println("Na ile rat chcesz kupić produkt?");
        System.out.println("Możliwa ilość rat 12-48");
        int liczbaRat = wczytywanie.nextInt();

        if(liczbaRat >48 || liczbaRat < 12){
            System.out.println("Podano ilość rat ze złego zakresu");
            return;
        }

        double oprocentowanie = 1.21;
        double cenaZOprocentowaniem = cena * oprocentowanie;

        System.out.println("Produkt cena: " + cena + " zł");
        System.out.println("Cena z podatkiem: " + cenaZOprocentowaniem + " zł");
        System.out.println("Cena z podatkiem na 12 rat " + cenaZOprocentowaniem / liczbaRat + "zł");
    }



}
