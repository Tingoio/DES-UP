package br.edu.up.modelos;

//Sobremesa é um item
public class Sobremesa extends Item {

    //Relações TEM UM
    private Ingrediente[] ingredientes;

    //Contructors
    public Sobremesa() {
    }

    public Sobremesa(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    //Getters and Setters
    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    
}
