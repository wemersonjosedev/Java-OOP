package compartimentoMemoria.vetores.LISTA_VETORES.aprovados.entities;

public class Students {
    
    private String name;
    private double primeiro_semestre;
    private double segundo_semestre;

    
    public Students(String name, double primeiro_semestre, double segundo_semestre) {
        this.name = name;
        this.primeiro_semestre = primeiro_semestre;
        this.segundo_semestre = segundo_semestre;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getPrimeiro_semestre() {
        return primeiro_semestre;
    }


    public void setPrimeiro_semestre(double primeiro_semestre) {
        this.primeiro_semestre = primeiro_semestre;
    }


    public double getSegundo_semestre() {
        return segundo_semestre;
    }


    public void setSegundo_semestre(double segundo_semestre) {
        this.segundo_semestre = segundo_semestre;
    }
}