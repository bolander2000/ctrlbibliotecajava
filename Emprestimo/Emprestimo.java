package com.mycompany.Biblioteca.Emprestimo;
import java.time.LocalDate;

import com.mycompany.Biblioteca.Amigo.Amigo;
import com.mycompany.Biblioteca.Item.Item;

public class Emprestimo {

	private int idAmigo;
	private int idItem;
	private LocalDate dataEmprestimo;
	private LocalDate dataDevolucao;

    public Emprestimo(int idAmigo, int idItem, LocalDate dataEmprestimo) {
        this.idAmigo = idAmigo;
        this.idItem = idItem;
        this.dataEmprestimo = dataEmprestimo;
    }

    public Emprestimo(int idAmigo, int idItem, LocalDate dataEmprestimo, LocalDate dataDevolucao, Item item, Amigo amigo) {
        this.idAmigo = idAmigo;
        this.idItem = idItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.item = item;
        this.amigo = amigo;
    }

    public Emprestimo(int idItem, LocalDate dataDevolucao, Item item) {
        this.idItem = idItem;
        this.dataDevolucao = dataDevolucao;
        this.item = item;
        
    }

    public Emprestimo(int idAmigo, int idItem, LocalDate dataEmprestimo, Item item, Amigo amigo) {
        this.idAmigo = idAmigo;
        this.idItem = idItem;
        this.dataEmprestimo = dataEmprestimo;
        this.item = item;
        this.amigo = amigo;
    }

    public int getIdAmigo() {
        return idAmigo;
    }

    public void setIdAmigo(int idAmigo) {
        this.idAmigo = idAmigo;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }
    

    
        
        
	
	// para a equipe pensar nesta repeti��o, pois pode-se obter os objetos pelo IDs
	private Item item;
	private Amigo amigo;
        @Override
	public String toString() {
            if (dataDevolucao==null)
		return "Título: "+ item.getTituloItem() +" | Amigo: " + amigo.getNomeAmigo() +" | Emprestimo: "+ dataEmprestimo+"\n";
            else
                return "Título: "+item.getTituloItem()+" | Devolução: "+dataDevolucao+"\n";
	}

}
