package src.src.Desafios.desafiosString;

import java.util.Scanner;

public class De03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite os 4 valores, e saberemos a diferença:");

        int A,B,C,D, DIFERENÇA;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFERENÇA = A * B - C * D;

        System.out.println("DIFERNÇA = " + DIFERENÇA);

        sc.close();
    }
}
