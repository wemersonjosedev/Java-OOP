package src.src.Desafios.desafioFor;

import java.util.Locale;
import java.util.Scanner;

public class De22 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double y = 0;
        double x = 0;
        double resultado = 0 ;


        for(int i = 0; i < N; i++ ){
            System.out.print("Digite o primeiro valor:");
            x = sc.nextDouble();

            System.out.print("Digite o segundo Valor:");
            y = sc.nextDouble();

            if (y == 0 ) {
                System.out.println("Divisão imposivel");
            }
            else {
                resultado = x / y;
                System.out.println(resultado);
            }
            
        }

        sc.close();
    }
}
