package com.mycompany.Biblioteca.Emprestimo;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListaEmprestimos {

	private ArrayList<Emprestimo> alEmprestimos;

	public ListaEmprestimos() {
		super();
		this.alEmprestimos = new ArrayList<Emprestimo>();
	}	
	
	// construtor
	// getters e setters
	// toString

    public ListaEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
        this.alEmprestimos = alEmprestimos;
    }

    public ArrayList<Emprestimo> getAlEmprestimos() {
        return alEmprestimos;
    }
    //public int getAlEmprestimosIdItem() {
    //    return alEmprestimos.;
    //}

    public void setAlEmprestimos(ArrayList<Emprestimo> alEmprestimos) {
        this.alEmprestimos = alEmprestimos;
    }
    public void addEmprestimo(Emprestimo emprestimo){
        alEmprestimos.add(emprestimo);
   }
    
}
