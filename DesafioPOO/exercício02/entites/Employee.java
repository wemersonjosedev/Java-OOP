package DesafioPOO.exercício02.entites;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;

    public double netSalary() {
        return grossSalary - tax;
    }

    public double increseSalary() {
        return netSalary() + (grossSalary * ( percentage / 100));
    }

    public String toString(){
        return "Employee: " + name + ", $ " + netSalary();
    }
}
