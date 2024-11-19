package src.src.Desafios.desafioFor;

import java.util.Scanner;

public class De20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int dentro = 0;
        int fora = 0;

        for(int x=0 ; x < N; x++){
            int z = sc.nextInt();
            if (z <=20 && z >=10) {
                dentro += 1 ;
            }
            else{
                fora += 1;
            }
        }
        System.out.printf("%d in %n", dentro);
        System.out.printf("%d out %n", fora);

        sc.close();
    }
}
