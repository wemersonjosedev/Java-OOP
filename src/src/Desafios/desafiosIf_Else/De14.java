package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        double x, y;
        System.out.print("Digite o valor de x e y do seu Plano Carteziano!:");
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x > 0 && y > 0 ) {
            System.out.println("Q1");
        }
        else if (x < 0 && y > 0 ) {
            System.out.println("Q2");
        }
        else if (x < 0 && y < 0 ) {
            System.out.println("Q3");
        }
        else if (x > 0 && y < 0 ) {
            System.out.println("Q4");
        }
        else if (x == 0 && y == 0) {
            System.out.println("Origem");
        }
        else if (y == 0 && x > 0 || x < 0) {
            System.out.println("Eixo X");
        }
        else if (x == 0 && y > 0 || y < 0) {
            System.out.println("Eixo Y");
        }
        
        sc.close();
    }
}
