package src.src.Desafios.desafioFor;

import java.util.Scanner;

public class De25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas de que deseja:");
        int N = sc.nextInt();
        int cubo = 0 ;
        int quadrado = 0 ;

        for(int i = 1; N >= i; i++){
            System.out.print(i + " " );
            quadrado = i * i ;
            System.out.print(quadrado + " ");
            cubo = i * i * i ;
            System.out.println(cubo);   
        }
        sc.close();
    }
}
