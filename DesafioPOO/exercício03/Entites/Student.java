package DesafioPOO.exercício03.Entites;

public class Student {
    public String name;
    public Double primeiroTrimestre;
    public Double segundoTrimestre;
    public Double terceiroTrimestre;
    public String aprovacao;

    public double finalGrade(){
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }
     
    public double missing(){
        return 60 - finalGrade();
    }
}
