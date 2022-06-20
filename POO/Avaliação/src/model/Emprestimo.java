package model;

import java.io.Serializable;

public class Emprestimo implements Serializable {
    private String professor;
    private String diaDoUso;
    private String equipamento;
    private String horarioEntrega;

    public Emprestimo(String professor, String equipamento, String horarioEntrega, String diaDoUso) {
        this.professor = professor;
        this.equipamento = equipamento;
        this.horarioEntrega = horarioEntrega;
        this.diaDoUso = diaDoUso;
    }
    
    public String getProfessor() {
        return professor;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public String getHorarioEntrega() {
        return horarioEntrega;
    }

    public String getDiaDoUso() {
        return diaDoUso;
    }
}
