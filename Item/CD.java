package com.mycompany.Biblioteca.Item;
public class CD extends Item {

	private String interpreteCD;
	private String estiloCD;

    public CD(String interpreteCD, String estiloCD, int IdItem, String tituloItem) {
        super(IdItem, tituloItem);
        this.interpreteCD = interpreteCD;
        this.estiloCD = estiloCD;
    }

    public CD(String interpreteCD, String estiloCD, int IdItem, String tituloItem, Disponibilidade dispItem) {
        super(IdItem, tituloItem, dispItem);
        this.interpreteCD = interpreteCD;
        this.estiloCD = estiloCD;
    }

    public String getInterpreteCD() {
        return interpreteCD;
    }

    public void setInterpreteCD(String interpreteCD) {
        this.interpreteCD = interpreteCD;
    }

    public String getEstiloCD() {
        return estiloCD;
    }

    public void setEstiloCD(String estiloCD) {
        this.estiloCD = estiloCD;
    }
    

}
