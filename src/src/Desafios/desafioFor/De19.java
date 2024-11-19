package src.src.Desafios.desafioFor;

import java.util.Scanner;

public class De19 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Digite um valor:");
        int X = sc.nextInt();

        for(int i=0; i<X; i++){
            if (i %2 !=0) {
              System.out.println(i);
            }
        }

        sc.close();
    }
}
