import java.util.Locale;
import java.util.Scanner;

public class De02 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double med = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for(int i=0; i<vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println();

        System.out.print("VALORES: ");

        for(int i=0; i<vetor.length; i++){
            System.out.print( " " +  vetor[i] + " ");
        }

        for(int i=0; i<vetor.length; i++){
            sum += vetor[i];
        }
        System.out.println();
        System.out.printf("SOMA: %.2f%n", sum);

        med = sum / n;
        System.out.printf("MEDIA = %.2f%n", med);

        sc.close();
    }
}
