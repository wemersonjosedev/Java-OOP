package src.src;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int hora;
        
         System.out.println("Quantas Horas são agora??");
        hora = sc.nextInt();
        
        if (hora < 12) {
            System.out.println("Bom dia!!!");
        }
        else if (hora <= 17) {
            System.out.println("Boa tarde!!");
        }
        else if (hora <= 23) {
            System.out.println("Boa noite!!");
        }
        else if (hora > 23) {
              System.out.println("Hora de dormir!!!");
        }  
      sc.close();
    }
}
