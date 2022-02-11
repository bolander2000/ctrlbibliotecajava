package com.mycompany.Biblioteca.Item;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Biblioteca {

	private String nomeBib;
	private ArrayList<Item> alItem;

	public Biblioteca(String nomeBib) {
		this.nomeBib = nomeBib;
		this.alItem = new ArrayList<Item>(); 
	}

	// m�todos, getters, setters, toString, compareTo etc conforme
	// a modelagem e encapsulamento que a equipe decidir implementar
	// v�rias op��es

        public String getNomeBib() {
            return nomeBib;
        }

        public void setNomeBib(String nomeBib) {
            this.nomeBib = nomeBib;
        }

        public ArrayList<Item> getAlItem() {
            return alItem;
        }

        public void setAlItem(ArrayList<Item> alItem) {
            this.alItem = alItem;
        }
       
        public int getAlItemSize(){
            int IdItem;
            IdItem = alItem.size();
            return IdItem;
        }
        
        public int getIdNewItem(){
            int IdItem;
            IdItem = alItem.size() + 1;
            return IdItem;
        } 
        public void addItem (Item item) {
		alItem.add(item);
        }	
}
