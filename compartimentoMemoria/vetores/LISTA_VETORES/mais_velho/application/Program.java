package compartimentoMemoria.vetores.LISTA_VETORES.mais_velho.application;

import java.util.Locale;
import java.util.Scanner;

import compartimentoMemoria.vetores.LISTA_VETORES.mais_velho.entities.Person;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Person[] vect = new Person[n];

        int idade = 0;
        for(int i=0; i<vect.length; i++){
            int num = i + 1;
            System.out.printf("Dados da %sa pessoa:%n", num);
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Idade: ");
            int age = sc.nextInt();

            vect[i] = new Person(name, age);

            if (vect[i].getAge() > idade) {
                idade = vect[i].getAge();
            }
            sc.nextLine();
            System.out.println();
        }
        
        System.out.println();
        for(int i=0; i<vect.length; i++){
            if (vect[i].getAge() == idade) {
                System.out.printf("PESSOA MAIS VELHA: %s%n", vect[i].getName());
            }
        }

        sc.close();
    }
}