package br.edu.up.modelos;

public class Despensa {

    //Relação TEM UM
    private Gerente gerente;
    private Ingrediente ingredientes;
    
    //Constructors
    public Despensa(Gerente gerente, Ingrediente ingredientes) {
        this.gerente = gerente;
        this.ingredientes = ingredientes;
    }

    public Despensa() {
    }

    public Despensa(Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }

    public Despensa(Gerente gerente) {
        this.gerente = gerente;
    }

    
    //Getters and Setters
    public Gerente getGerente() {
        return gerente;
    }
    
    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }
    
    public Ingrediente getIngredientes() {
        return ingredientes;
    }
    
    public void setIngredientes(Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }
    
}
