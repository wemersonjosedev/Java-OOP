package compartimentoMemoria.vetores.LISTA_VETORES.soma_vetores.application;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];


        System.out.println("Digite os valores do vetor A:");
        for(int i=0; i<A.length; i++){
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for(int i=0; i<B.length; i++){
            B[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE");
        for(int i=0; i<C.length; i++){
            int result = A[i] + B[i];
            System.out.println(result);
        }

        sc.close();
    }
}