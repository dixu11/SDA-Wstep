package wstep2;

import java.util.Scanner;

class InstrukcjeWarunkowe {

    public static void main(String[] args) {
        System.out.println("Podaj temperaturę wody");
        Scanner scanner = new Scanner(System.in);
        double temperatura = scanner.nextDouble();

        if (temperatura < 0) {
            System.out.println("Woda zamarza");
        }else if(temperatura>100){
            System.out.println("Woda paruje");
        } else if(temperatura>80){
            System.out.println("Woda gotuje się");
        }else{
            System.out.println("Woda jest w stanie ciekłym");
        }


    }



}
