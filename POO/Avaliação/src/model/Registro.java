package model;

public class Registro {
    private String professor;
    private String diaDoUso;
    private String equipamento;
    private String horarioEntrega;

    public Registro(String professor, String equipamento, String horarioEntrega, String diaDoUso) {
        this.professor = professor;
        this.equipamento = equipamento;
        this.horarioEntrega = horarioEntrega;
        this.diaDoUso = diaDoUso;
    }

    public String getProfessor() {
        return professor;
    }

    public String getDiaDoUso() {
        return diaDoUso;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public void setDiaDoUso(String diaDoUso) {
        this.diaDoUso = diaDoUso;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }
}