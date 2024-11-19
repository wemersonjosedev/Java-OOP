package compartimentoMemoria.vetores.LISTA_VETORES.dados_pessoas.application;

import java.util.Locale;
import java.util.Scanner;

import compartimentoMemoria.vetores.LISTA_VETORES.dados_pessoas.entities.Person;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();

        Person[] vector = new Person[n];

        for(int i=0; i<vector.length; i++){
            int num = i + 1;
            System.out.printf("Altura da %sa pessoa: ", num);
            double heigth = sc.nextDouble();

            System.out.printf("Gênero da %sa pessoa: ", num);
            char sexo = sc.next().charAt(0);
            sc.nextLine();

            vector[i] = new Person(heigth, sexo);
            System.out.println();
        }

        double menor_heigth = vector[0].getHeigth();
        double maior_heigth = vector[0].getHeigth();
        double soma_heigth_woman = 0;
        double media_heigth_woman = 0;
        int number_woman = 0;
        int number_men = 0;


        for(int i=1; i<vector.length; i++){

            if (vector[i].getHeigth() > maior_heigth) {
                maior_heigth = vector[i].getHeigth();
            }

            else if (vector[i].getHeigth() < menor_heigth) {
                menor_heigth = vector[i].getHeigth();
            }
        }

        for(int i=0; i<vector.length; i++){
            if (vector[i].getSexo() == 'F' || vector[i].getSexo() == 'f') {
                soma_heigth_woman += vector[i].getHeigth();
                number_woman++;
            }
            else if (vector[i].getSexo() == 'M' || vector[i].getSexo() == 'm') {
                number_men++;
            }
        }
        
        System.out.printf("Menor altura = %.2f%n", menor_heigth);
        System.out.printf("Maior altura = %.2f%n", maior_heigth);
        media_heigth_woman = soma_heigth_woman / number_woman;
        System.out.printf("Média das alturas das mulheres = %.2f%n", media_heigth_woman);
        System.out.printf("Número de homens = %d%n", number_men);

        sc.close();
    }
}
