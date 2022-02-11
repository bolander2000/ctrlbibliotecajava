package com.mycompany.Biblioteca.Amigo;
import java.util.ArrayList;

public class ListaAmigos {

	private ArrayList<Amigo> alAmigos;
	
	// construtor
	public ListaAmigos() {
		super();
		this.alAmigos = new ArrayList<Amigo>();
	}
	
	public int addAmigo (String nome) {
		int idAmigo = alAmigos.size() + 1; 
		Amigo amigo = new Amigo(idAmigo, nome);
		alAmigos.add(amigo);
		return idAmigo;
	}
	
	public ArrayList<Amigo> getListaAmigos(){
		return alAmigos;
	}
        
        public int getAlAmigosSize(){
            int IdAmigo;
            IdAmigo = alAmigos.size();
            return IdAmigo;
        }
	// getters e setters
	// toString

}
