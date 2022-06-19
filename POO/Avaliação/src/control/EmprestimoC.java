package control;

import java.util.ArrayList;

import model.Emprestimo;

public class EmprestimoC {
    private static EmprestimoC instancia = null;

    public static EmprestimoC getInstancia() {
        if (instancia == null) {
            instancia = new EmprestimoC();
        }
        return instancia;
    }

    public ArrayList<Emprestimo> lista = new ArrayList<Emprestimo>();
    
    public void adicionarEmprestimo(String professor, String equipamento, String horarioEntrega, String diaDoUso) {
        Emprestimo emprestimo = new Emprestimo(professor, equipamento, horarioEntrega, diaDoUso);
        lista.add(emprestimo);
    }
}
