package model;

public class Registro {
    public String professor;
    public String diaDoUso;
    public String equipamento;
    public String horarioEntrega;

    public Registro(String professor, String diaDoUso, String equipamento, String horarioEntrega) {
        this.professor = professor;
        this.diaDoUso = diaDoUso;
        this.equipamento = equipamento;
        this.horarioEntrega = horarioEntrega;
    }
}
