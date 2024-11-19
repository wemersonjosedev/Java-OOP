package compartimentoMemoria.vetores.LISTA_VETORES.soma_vetor.application;

import java.util.*;

public class Program {
    


    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        double[] reais = new double[n];

        for(int i=0; i<reais.length; i++){
            sc.nextLine();
            System.out.print("Digite um número: ");
            reais[i] = sc.nextDouble();
        }

        System.out.println();

        double soma = 0;
        System.out.print("Valores = ");
        for(int i=0; i<reais.length; i++){
            System.out.print(reais[i] + "  ");

            soma += reais[i];
        }
        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);

        double media = soma / reais.length;

        System.out.printf("MÉDIA = %.2f%n", media);

        

        sc.close();
    }
}
