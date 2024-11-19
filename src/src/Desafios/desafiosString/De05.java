package src.src.Desafios.desafiosString;

import java.util.Locale;
import java.util.Scanner;

public class De05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("Digite o Código, quantidade, e valor do produto 1 e 2:");
    
        Scanner sc = new Scanner(System.in);

        int cp1, qp1, cp2, qp2;
        double vp1, vp2, valor1, valor2, valorFinal;

        cp1 = sc.nextInt();
        qp1 = sc.nextInt();
        vp1 = sc.nextDouble();
        cp2 = sc.nextInt();
        qp2 = sc.nextInt();
        vp2 = sc.nextDouble();

        valor1 = vp1 * qp1;
        valor2 = vp2 * qp2;

        valorFinal = valor1 + valor2;
        System.out.println();
        System.out.printf("Código do produto 1: %d%n", cp1);
        System.out.println("-------------------------------");
        System.out.printf("Código do produto 2: %d%n", cp2);
        System.out.println("-------------------------------");
        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorFinal);
        System.out.println();


        sc.close();
    }
}
