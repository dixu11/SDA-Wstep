import java.util.Scanner;

public class Petle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int punkty = 0;
        int lacznePunkty = 0;

        while (punkty != -1) { // kiedy mamy powtarzać wprowadzanie punktacji?
            System.out.println("Podaj ile dostałeś punktów:  (pisząc -1 kończysz wpisywanie)");
            punkty = scanner.nextInt();
            if(punkty == -1){
                break;
            }
            lacznePunkty = lacznePunkty + punkty;
        }

        System.out.println("Lacznie nazbierales punktow: " + lacznePunkty);
    }
}
