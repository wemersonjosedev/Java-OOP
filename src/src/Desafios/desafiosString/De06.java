package src.src.Desafios.desafiosString;

import java.util.Locale;
import java.util.Scanner;

public class De06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Digite o valor de A,B, e C:");

       Scanner sc = new Scanner(System.in);

       double A, B, C, At, Ac, Atr, Aq, Ar;
   

       A = sc.nextDouble();
       B = sc.nextDouble();
       C = sc.nextDouble();
         
       At =(A * C) / 2;
       
       Ac = Math.pow(C, 2.00) * 3.14159;

       Atr =((A + B) * C) / 2;

       Aq = Math.pow(B, 2.00);

       Ar = A * B;

    System.out.printf("TRIÂNGULO: %.3f%n", At);
    System.out.printf("CIRCULO: %.3f%n", Ac);
    System.out.printf("TRAPÉZIO: %.3f%n", Atr);
    System.out.printf("QUADRADO: %.3f%n", Aq);
    System.out.printf("RETANGULO: %.3f%n", Ar);

        sc.close();
    }
    
}
