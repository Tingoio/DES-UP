package br.edu.up.modelos;

public class Cardapio {

    //Relações TEM UM
    private Gerente gerente;
    private Prato[] pratos;
    private Bebida[] bebidas;
    private Sobremesa[] sobremesa;
    
    //Constructors
    
    public Cardapio(Gerente gerente) {
        this.gerente = gerente;
    }

    public Cardapio() {
    }

    public Cardapio(Prato[] pratos, Bebida[] bebidas, Sobremesa[] sobremesa) {
        this.pratos = pratos;
        this.bebidas = bebidas;
        this.sobremesa = sobremesa;
    }

    public Cardapio(Gerente gerente, Prato[] pratos, Bebida[] bebidas, Sobremesa[] sobremesa) {
        this.gerente = gerente;
        this.pratos = pratos;
        this.bebidas = bebidas;
        this.sobremesa = sobremesa;
    }
    
    //Getters and Setters
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public Prato[] getPratos() {
        return pratos;
    }

    public void setPratos(Prato[] pratos) {
        this.pratos = pratos;
    }

    public Bebida[] getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida[] bebidas) {
        this.bebidas = bebidas;
    }

    public Sobremesa[] getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(Sobremesa[] sobremesa) {
        this.sobremesa = sobremesa;
    }
    
    

}
