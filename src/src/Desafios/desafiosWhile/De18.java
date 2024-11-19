package src.src.Desafios.desafiosWhile;

import java.util.Scanner;

public class De18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0, gasolina = 0, disel = 0;

        System.out.println("-------------------------------");
        System.out.println("----------Combustível----------");
        System.out.println("-                             -");
        System.out.println("------------1.Álcool-----------");
        System.out.println("-----------2.Gasolina----------");
        System.out.println("------------3.Disel------------");
        System.out.println("-------------------------------");   
        System.out.println();
        System.out.println("Digite o número de combustivel de sua preferencia,para finalizar digite 4!");

        int combustivel;
        combustivel = sc.nextInt();

        while (combustivel != 4) {

            switch (combustivel) {
                case 1:
                    alcool += 1;
                    break;

                case 2:
                    gasolina += 1;
                    break;

                case 3:
                    disel += 1;
                    break;
            }
            combustivel = sc.nextInt();

        }

        sc.close();

        System.out.println("Muito Obrigado");
        System.out.printf("Alcool: %d%n", alcool);
        System.out.printf("Gasolina: %d%n", gasolina);
        System.out.printf("Disel: %d%n", disel);
    }
}
