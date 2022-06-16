package control;

import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoC {
    public ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();

    public void adicionarEmprestimo(String professor, String diaDoUso, String equipamento, String horarioEntrega) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setProfessor(professor);
        emprestimo.setDiaDoUso(diaDoUso);
        emprestimo.setEquipamento(equipamento);
        emprestimo.setHorarioEntrega(horarioEntrega);
        lista.add(emprestimo);
    }

    public ArrayList<Emprestimo> getLista() {
        return lista;
    }

    public EmprestimoC getInstancia() {
        return this;
    }

    public ArrayList<String> professores() {
        ArrayList<String> professores = new ArrayList<String>();
        for(int i = 0; i < lista.size(); i++) {
            professores.add(lista.get(i).getProfessor());
        }
        return professores;
    }

    public boolean consultarProfessor(Emprestimo emprestimo) {
        boolean retorno = false;
        for(int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getProfessor().equals(emprestimo.getProfessor())) {
                retorno = true;
            }
        }
        return retorno;
    }
}
