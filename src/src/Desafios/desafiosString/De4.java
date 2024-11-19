package src.src.Desafios.desafiosString;

import java.util.Locale;
import java.util.Scanner;

public class De4 {

    public static void main(String[] args) {
         Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);

       
        System.out.println("Digite o número do funcionário:");
        System.out.println("Digite o número de horas trabalhadas:");
        System.out.println("Digite o sálario do funcionário:");

        int N, H;
        Double T, S;

        N = sc.nextInt();
        H = sc.nextInt();
        T = sc.nextDouble();

        S = T * H;

        System.out.println("NUMBER = " + N);
        System.out.printf("SALARY = U$ %.2f%n", S);

        sc.close();
    }
}
