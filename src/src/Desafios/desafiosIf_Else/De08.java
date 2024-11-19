package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;
public class De08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro e diremos se ele é negativo ou não:");

        int numero;

        numero = sc.nextInt();

        if (numero >= 0) {
            System.out.println("Seu número é positivo!!");
        }
        else {
            System.out.println("Seu número é negativo!!");
        }
        sc.close();
    }
}