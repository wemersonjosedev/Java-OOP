package compartimentoMemoria.vetores.LISTA_VETORES.dados_pessoas.entities;

public class Person {
    
    private double heigth; 
    private char sexo;

    
    public Person(double heigth, char sexo) {
        this.heigth = heigth;
        this.sexo = sexo;
    }

    public double getHeigth() {
        return heigth;
    }


    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }


    public char getSexo() {
        return sexo;
    }


    public void setSexo(char sexo) {
        this.sexo = sexo;
    } 
}
