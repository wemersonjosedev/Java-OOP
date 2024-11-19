package compartimentoMemoria.vetores.LISTA_VETORES.negativos.application;

import java.util.*;

public class Program {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] number = new int[n];

        for(int i=0; i<number.length; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            number[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i=0; i<number.length; i++){
            if (number[i] < 0) {
                System.out.println(number[i]);
            }
        }

        sc.close();
    }
}
