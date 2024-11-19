package DesafioPOO.exercício02.application;

import java.util.Locale;
import java.util.Scanner;

import DesafioPOO.exercício02.entites.Employee;

public class Program {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        System.out.println();

        System.out.printf("Employee: " + employee.name + ", $ %.2f%n", employee.netSalary());
        System.out.println();

        System.out.print("Which percentage to increase salary?");
        employee.percentage = sc.nextDouble();

        System.out.println();
        System.out.printf("Updated data: %s, $ %.2f%n", employee.name, employee.increseSalary());

        sc.close();
    }
}
