package src.src.Desafios.desafiosString;

import java.util.Scanner;

public class De01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro e o segundo número:");

        int n1, n2;
        int resultado;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        resultado = (n1 + n2);

        System.out.println("SOMA = " + resultado);

        sc.close();
    }
}
