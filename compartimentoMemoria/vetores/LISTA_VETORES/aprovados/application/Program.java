package compartimentoMemoria.vetores.LISTA_VETORES.aprovados.application;

import java.util.Locale;
import java.util.Scanner;

import compartimentoMemoria.vetores.LISTA_VETORES.aprovados.entities.Students;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int n = sc.nextInt();

        Students[] vect = new Students[n];

        sc.nextLine();
        for(int i=0; i<vect.length; i++){
            int num = i + 1;
            System.out.printf("Digite nome, primeira e segunda nota do %so aluno: %n", num);

            String name = sc.nextLine();

            double primeiro_semestre = sc.nextDouble();

            double segundo_semestre = sc.nextDouble();
            sc.nextLine();

            vect[i] = new Students(name, primeiro_semestre, segundo_semestre);
            System.out.println();
        }

        System.out.println();
        System.out.println("Alunos aprovados: ");
        System.out.println();
        for(int i=0; i<vect.length; i++){
            double ma = 6.0;
            double media = ((vect[i].getPrimeiro_semestre() + vect[i].getSegundo_semestre()) / 2);
            if (media >= ma) {
                System.out.println(vect[i].getName());
            }
        }

        sc.close();
    }
}
