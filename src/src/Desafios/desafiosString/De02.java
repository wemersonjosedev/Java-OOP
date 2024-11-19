package src.src.Desafios.desafiosString;

import java.util.Locale;
import java.util.Scanner;

public class De02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Digite o valor da área:");

    
        double area;
        double r;
        double raio;
        double pi = 3.14159;

        raio = sc.nextDouble();

        r = Math.pow(raio, 2.00);

        area = pi * r;

        System.out.printf("A = %.4f%n", area);

        sc.close();
    }
}
