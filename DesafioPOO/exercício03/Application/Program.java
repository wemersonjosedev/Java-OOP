package DesafioPOO.exercício03.Application;

import java.util.Locale;
import java.util.Scanner;

import DesafioPOO.exercício03.Entites.Student;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();
        System.out.print("Name of the student: ");
        student.name = sc.nextLine();

        System.out.print("First quarter grade: ");
        student.primeiroTrimestre = sc.nextDouble();

        System.out.print("Second quarter note: ");
        student.segundoTrimestre = sc.nextDouble();

        System.out.print("Third quarter note: ");
        student.terceiroTrimestre = sc.nextDouble();


        if (student.finalGrade() > 60.0) {
            System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
            System.out.printf("PASS");
        }
        else{
            System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
            System.out.println("FAILED"); 
            System.out.printf("MISSING %.2f POINTS%n", student.missing());
 
        }



        sc.close();
    }
}
