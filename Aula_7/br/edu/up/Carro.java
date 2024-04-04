package br.edu.up;

public class Carro extends Veiculo {
    
    public static enum Tipo{
        FERRARI,
        UNO
    }

    // Atributos, carascterísticas ou propriedades
    private Tipo tipo;
    private String modelo;
    private int velocidade = 0;

    public int getVelocidade(){
        return this.velocidade;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Carro(){

    }

    public Carro(Tipo tipo){
        this.tipo = tipo;
    }
    
    public Carro(Tipo tipo, String modelo){
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public void acelerar(){
        if ((tipo.equals(Tipo.UNO)&&(this.velocidade <= 150))) {
            this.velocidade++;
        }
    }

    public void frear(){
        if ((tipo.equals(Tipo.FERRARI))&&(this.velocidade >= 0)){
            this.velocidade--;
        }
    }
}