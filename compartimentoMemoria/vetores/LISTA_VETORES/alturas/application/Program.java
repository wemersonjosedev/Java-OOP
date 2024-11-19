package compartimentoMemoria.vetores.LISTA_VETORES.alturas.application;

import java.util.Locale;
import java.util.Scanner;

import compartimentoMemoria.vetores.LISTA_VETORES.alturas.entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantas pessoas serão digitadas? ");
		int n = sc.nextInt();

		Person[] vect = new Person[n];

		double hm = 0;
		int idade = 0;
		sc.nextLine(); // Consome a nova linha restante após nextInt()

		for (int i = 0; i < vect.length; i++) {
			int number = i + 1;
			System.out.printf("Dados da %da pessoa:%n", number);
			System.out.print("Nome: ");
			String name = sc.nextLine();

			System.out.print("Idade: ");
			int age = sc.nextInt();

			System.out.print("Altura: ");
			double height = sc.nextDouble();
			sc.nextLine(); // Consome a nova linha restante após nextDouble()

			hm += height;

			vect[i] = new Person(name, age, height);
			System.out.println();

			if (age < 16) {
				idade += 1;
			}
		}

		double average_height = hm / vect.length;
		System.out.printf("Altura média: %.2f%n", average_height);

		double im = 100.0 * ((double) idade / vect.length);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", im);

		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.printf("%s%n", vect[i].getName());
			}
		}

		sc.close();
	}
}
