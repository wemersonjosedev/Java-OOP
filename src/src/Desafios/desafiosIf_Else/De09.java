package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor e diremos se é par ou ímpar:");

        Double valor;

        valor = sc.nextDouble();

        if (valor %2 == 0) {
            System.out.println("Seu valor é par!!!");
        }
        else {
            System.out.println("Seu valor é ímpar!!");
        }

        sc.close();
    }
}
