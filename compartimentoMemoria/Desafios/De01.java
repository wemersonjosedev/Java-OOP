import java.util.Locale;
import java.util.Scanner;

public class De01 {
    
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n;
            
            System.out.println("Quantos numeros voce vai digitar? ");
            n = sc.nextInt();

            int[] vetor = new int[n];

            for(int i=0; i<n; i++){
                System.out.println("Digite um numero: ");
                vetor[i] = sc.nextInt();
            }

            System.out.println("NUMEROS NEGATIVOS:");

            for(int i=0; i<n; i++){
                if (vetor[i] > 9) {
                    System.out.printf("%d%n", vetor[i]);
                }
            }
            sc.close();
    }
}