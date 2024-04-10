package br.edu.up.modelos;

//Prato é um item
public class Prato extends Item {

    private ChefeCozinha chefeCozinha;
    private Ingrediente ingredientes;

    //Contructors
    public Prato(ChefeCozinha chefeCozinha, Ingrediente ingredientes) {
        this.chefeCozinha = chefeCozinha;
        this.ingredientes = ingredientes;
    }
    public Prato(ChefeCozinha chefeCozinha) {
        this.chefeCozinha = chefeCozinha;
    }
    
    public Prato(Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Prato() {
    }
    
    //Getters and Setters
    public ChefeCozinha getChefeCozinha() {
        return chefeCozinha;
    }
    public void setChefeCozinha(ChefeCozinha chefeCozinha) {
        this.chefeCozinha = chefeCozinha;
    }
    public Ingrediente getIngredientes() {
        return ingredientes;
    }
    public void setIngredientes(Ingrediente ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    
}
