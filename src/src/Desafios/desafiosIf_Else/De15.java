package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De15 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, resultado;

        salario = sc.nextDouble();

        if (salario <= 2000.00) {
         resultado = 0.0;
        }
        else if (salario <= 3000.00 ) {
           resultado = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.00) {
            resultado = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else{
            resultado = (salario - 4500.0) * 0.28 +1500.0 * 0.18 + 1000.0 * 0.08;
        }
        if (resultado == 0.0) {
            System.out.println("Insento");
        }
        else{
            System.out.printf("R$ %.2f%n", resultado);
        }
        
        sc.close();
    }
}
