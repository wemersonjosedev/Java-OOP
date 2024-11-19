package compartimentoMemoria.vetores.LISTA_VETORES.maior_posicao.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] number = new double[n];

        double nm = 0;
        for(int i=0; i<number.length; i++){
            System.out.print("Digite um número: ");
            number[i] = sc.nextDouble();

            if (number[i] > nm) {
                nm = number[i];
            }
        }

        System.out.println();
        System.out.printf("MAIOR VALOR = %.1f%n", nm);

        for(int i=0; i<number.length; i++){
            if (number[i] == nm) {
                System.out.printf("POSIÇÃO DO MAIOR VALOR = %d%n", i);
            }
        }

        sc.close();
    }
}
