package src.src.Desafios.desafiosWhile;

import java.util.Scanner;

public class De17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x,y;
        System.out.print("Digite o valor de x:");
        x = sc.nextInt();
        System.out.print("Digite o valor de y:");
        y = sc.nextInt();

        while (x != 0 && y != 0) {

            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante");
            } else if (x > 0 && y < 0 ) {
                System.out.println("Quarto Quadrante"); 
            }
            System.out.print("Digite o valor de x:");
            x = sc.nextInt();
            System.out.print("Digite o valor de y:");
            y = sc.nextInt();
        }

        sc.close();
    }
}
