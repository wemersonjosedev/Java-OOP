package compartimentoMemoria.vetores.LISTA_VETORES.numeros_pares.applicarion;

import java.util.*;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] number = new int[n];

        for(int i=0; i<number.length; i++){
            System.out.print("Digite um número: ");
            number[i] = sc.nextInt();
        }

        int np = 0;
        System.out.println("NÚMEROS PARES:");
        for(int i=0; i<number.length; i++){
            if (number[i] % 2 == 0) {
                System.out.print(number[i] + " ");
                np += 1;
            }
        }

        System.out.println();
        System.out.printf("QUANTIDADE DE PARES = %d%n", np);

        sc.close();
    }

}
