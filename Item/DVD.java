package com.mycompany.Biblioteca.Item;
public class DVD extends Item {
        
        private String diretorDVD;
	private String generoDVD;

    public DVD(String diretorDVD, String generoDVD, int IdItem, String tituloItem) {
        super(IdItem, tituloItem);
        this.diretorDVD = diretorDVD;
        this.generoDVD = generoDVD;
    }

    public DVD(String diretorDVD, String generoDVD, int IdItem, String tituloItem, Disponibilidade dispItem) {
        super(IdItem, tituloItem, dispItem);
        this.diretorDVD = diretorDVD;
        this.generoDVD = generoDVD;
    }

    public String getDiretorDVD() {
        return diretorDVD;
    }

    public void setDiretorDVD(String diretorDVD) {
        this.diretorDVD = diretorDVD;
    }

    public String getGeneroDVD() {
        return generoDVD;
    }

    public void setGeneroDVD(String generoDVD) {
        this.generoDVD = generoDVD;
    }

        


}
