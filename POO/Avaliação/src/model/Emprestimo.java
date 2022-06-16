package model;

public class Emprestimo {
    private String professor;
    private String diaDoUso;
    private String equipamento;
    private String horarioEntrega;

    public Emprestimo getInstacia() {
        return this;
    }

    public String getDiaDoUso() {
        return diaDoUso;
    }

    public void setDiaDoUso(String diaDoUso) {
        this.diaDoUso = diaDoUso;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }
    
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public void setHorarioEntrega(String horarioEntrega) {
        this.horarioEntrega = horarioEntrega;
    }
}
