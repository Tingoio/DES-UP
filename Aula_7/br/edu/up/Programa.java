package br.edu.up;

import br.edu.up.Carro.Tipo;

public class Programa {
    public static void main(String[] args){

        //PROGRAMAÇÃO ESTRUTURADA
        // String[] modelos = {"Mille", "California"};
        // int[] velocidades = {80, 300};
        // String[] nomes = {"Pedro", "James", "Rafael"};
        // int[] alturas = {175, 175, 180};

        //PROGRAMAÇÃO ORIENTADA A OBJETOS

        Carro uno = new Carro(Carro.Tipo.UNO, "Mille");
        // uno.modelo = "Mille"
        // uno.velocidade = 80;
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        System.out.println("Velocidade do uno: "+uno.getVelocidade());

        Carro ferrari = new Carro(Carro.Tipo.FERRARI);
        // ferrari.modelo = "California";
        ferrari.setModelo("California");
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();
        uno.acelerar();

        System.out.println("Velocidade da ferrari: "+ferrari.getVelocidade());
        
        Pessoa pedro = new Pessoa();
        pedro.nome = "Pedro";
        pedro.altura = 175;

        Pessoa James = new Pessoa();
        James.nome = "James";
        James.altura = 175;

        Pessoa Rafael = new Pessoa();
        Rafael.nome = "Rafael";
        Rafael.altura = 180;
    }
}
