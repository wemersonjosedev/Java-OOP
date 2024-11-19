package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De13 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Digite um valor e saberemos se ele se encontra em nossas exigências:");
        Scanner sc = new Scanner(System.in);

        double num;

        num = sc.nextDouble();

        if (num >=25) {
            System.out.println("Intervalo (0,25)");
        }
        else if (num <=50) {
            System.out.println("Intervalo (25,50)");
        }
        else if (num <=75) {
            System.out.println("Intervalo (50,75)");
        }
        else if (num <=100) {
            System.out.println("Intervalo (75,100)");
        }
        else  {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}
