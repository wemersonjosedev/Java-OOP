package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá tudo bem?");
        System.out.println();
        System.out.print("Escolha qual item da lista você irá comer e digite o código e a quantidade:");

       double total, quant;
       int codigo;

        codigo = sc.nextInt();
        quant = sc.nextInt();
        
        if (codigo == 1) {
            System.out.println("HUM...Você escolheu Cachorro-Quente!!");
            double cachorroQuente = 4.00;
            total = cachorroQuente * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 2 ) {
            System.out.println("HUM...Você escolheu X-Salada!!");
            double X_Salada = 4.50;
            total = X_Salada * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 3 ) {
            System.out.println("HUM...Você escolheu X-Bacon!!");
            double X_Bacon = 5.00;
            total = X_Bacon * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 4 ) {
            System.out.println("HUM...Você escolheu Torrada simples!!");
            double TorradaSimples = 2.00;
            total = TorradaSimples * quant;
            System.out.printf("Total: R$ %.2f%n", total);
        }
        else if (codigo == 5 ) {
            System.out.println("HUM...Você escolheu Refrigerante!!");
            double Refrigerante = 1.50;
            total = Refrigerante * quant;
            System.out.printf("Total: R$ %.f2%n", total);
        }
        sc.close();
    }
}
