package com.mycompany.Biblioteca.Item;
public class Livro extends Item {

	private String autorLivro;
	private int totPagLivro;

    public Livro(String autorLivro, int totPagLivro, int IdItem, String tituloItem) {
        super(IdItem, tituloItem);
        this.autorLivro = autorLivro;
        this.totPagLivro = totPagLivro;
    }

    public Livro(String autorLivro, int totPagLivro, int IdItem, String tituloItem, Disponibilidade dispItem) {
        super(IdItem, tituloItem, dispItem);
        this.autorLivro = autorLivro;
        this.totPagLivro = totPagLivro;
    }

    public Livro(int IdItem, String tituloItem) {
        super(IdItem, tituloItem);
    }

    public Livro(String autorLivro, int IdItem, String tituloItem) {
        super(IdItem, tituloItem);
        this.autorLivro = autorLivro;
    }
    
//    w    

    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public int getTotPagLivro() {
        return totPagLivro;
    }

    public void setTotPagLivro(int totPagLivro) {
        this.totPagLivro = totPagLivro;
    }
        

}
