package src.src.Desafios.desafioFor;

import java.util.Scanner;

public class De24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite número para saber seus divisores:");
        int N = sc.nextInt();

        for(int i = 1; N >= i ; i++ ){
            if (N % i == 0 ) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
