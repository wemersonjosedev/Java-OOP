package src.src.Desafios.desafiosIf_Else;

import java.util.Locale;
import java.util.Scanner;

public class De11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        System.out.print("Digite o inicio do jogo e o fim do jogo:");

        int inicio, fim, hora;

        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio > fim) {
            hora = ( 24 - inicio) + fim;
            System.out.printf("O jogo durou %d horas%n", hora);
        }
        else if (inicio == fim) {
            System.out.println("O jogo durou 24 horas");
        }
        else {
            hora = fim - inicio;
            System.out.printf("O jogo durou %d horas%n", hora);
        }

        sc.close();
    }
}
