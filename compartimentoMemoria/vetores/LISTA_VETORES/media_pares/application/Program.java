package compartimentoMemoria.vetores.LISTA_VETORES.media_pares.application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for(int i=0; i<vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        double md = 0;
        double np = 0;
        
        for(int i=0; i<vect.length; i++){
            
            if (vect[i] % 2 == 0) {
                md += vect[i];
                np += 1;
            }
        }

        if (md != 0) {
            double media_pares = md / np;
            System.out.printf("MÉDIA DOS PARES = %.1f%n", media_pares);
        }
        else{
            System.out.println("NENHUM NUMERO PAR!");
        }
        sc.close();
    }

}