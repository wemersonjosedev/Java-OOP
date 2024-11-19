package src.src.Desafios.desafiosWhile;

import java.util.Scanner;

public class De16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Por favor digite sua senha: ");

        int x = sc.nextInt();

        while (x != 2002) {
            System.out.println("Senha Inválida!!");
            System.out.println("Digite a senha correta!");
            x = sc.nextInt();
        }
        System.out.println("Acesso permitido");
        sc.close();
    }
}
