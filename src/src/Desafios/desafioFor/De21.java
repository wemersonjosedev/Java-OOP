package src.src.Desafios.desafioFor;

import java.util.Locale;
import java.util.Scanner;

public class De21 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double x ;
        double y ;
        double peso = 0;
        double resultado = 0;
        double r;

        for (int i = 0; i < N; i++) {
            System.out.print("Digite o valor:");
            x = sc.nextDouble();
            System.out.print("Digite o peso:");
            y = sc.nextDouble();
            resultado += x * y;
            peso += y; 
        }
        r = resultado / peso ;

        System.out.printf("%.1f%n", r);
        sc.close();
    }
}
