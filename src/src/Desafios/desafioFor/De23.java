package src.src.Desafios.desafioFor;

import java.util.Scanner;

public class De23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o Fatorial:");
        int N = sc.nextInt();
        int resultado = 1;

        for (int i = N; i >= 1; i--) {
            resultado *= i;
        }

       
        System.out.println(resultado);
        sc.close();
    }
}