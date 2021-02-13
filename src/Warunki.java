import java.util.Scanner;

public class Warunki {

    public static void main(String[] args) {
        System.out.println("Podaj temperaturę wody");
        Scanner scanner = new Scanner(System.in); // przygotowanie skanowania z konsoli
        //int - calkowite
        //double - zmiennoprzecinkwoe
        //String - tekst

        int temperatura = scanner.nextInt();

        if(temperatura > 100){
            System.out.println("Woda paruje");
        }else if(temperatura>80){
            System.out.println("Woda się gotuje");
        } else if (temperatura>0){
            System.out.println("Woda w stanie ciekłym");
        }  else {
            System.out.println("Woda zamarza");
        }

    }


}
