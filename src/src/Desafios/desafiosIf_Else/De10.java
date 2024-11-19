package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
         Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número A e B:");

        int A, B;

        A = sc.nextInt();
        B = sc.nextInt();
        

        if (A % B == 0 || B % A == 0 ) {
            System.out.println("São multiplos!");
        }
        else{
            System.out.println("Não são multiplos!");
        }
         sc.close();
    }
}
