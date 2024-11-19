package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número:");

         double num;
         num = sc.nextDouble();

        if (num < 0) {
            System.out.println("NEGATIVO!");
        }
        else{
            System.out.println("POSITIVO");
        }
        sc.close();
    }
}
