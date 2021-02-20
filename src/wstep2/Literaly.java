package wstep2;

class Literaly {

    public static void main(String[] args) {
        System.out.println("abc 123" + 2);
        System.out.println("cena to: " + (123 + 2));

        // "abc 123" - literał String -> tekst
        // 123 - Literał int -> liczba całkowita
        // 123.7 - literał double -> liczba z resztą dziesiętną
        System.out.println(6/4.1);


        //String double int
        double cenaPralki = 1399;
        double oprocentowanie = 1.21;
        double cenaZOprocentowaniem = cenaPralki * oprocentowanie;

        System.out.println("Pralka cena: " + cenaPralki + " zł");
        System.out.println("Cena z podatkiem: " + cenaZOprocentowaniem + " zł");
        System.out.println("Cena z podatkiem na 12 rat " + cenaZOprocentowaniem / 12 + "zł");
    }
}
