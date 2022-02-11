package com.mycompany.Biblioteca.Item;
public abstract class Item {

	private int IdItem;
	private String tituloItem;
	private Disponibilidade dispItem;

    public int getIdItem() {
        return IdItem;
    }

    public void setIdItem(int IdItem) {
        this.IdItem = IdItem;
    }

    public Item(int IdItem, String tituloItem, Disponibilidade dispItem) {
        this.IdItem = IdItem;
        this.tituloItem = tituloItem;
        this.dispItem = dispItem;
    }

    public String getTituloItem() {
        return tituloItem;
    }

    public void setTituloItem(String tituloItem) {
        this.tituloItem = tituloItem;
    }

    public Disponibilidade getDispItem() {
        return dispItem;
    }

    public void setDispItem(Disponibilidade dispItem) {
        this.dispItem = dispItem;
    }
        
    public Item(int IdItem, String tituloItem) {
	super();
	this.IdItem = IdItem;
	this.tituloItem = tituloItem;
    }
	

	
}
