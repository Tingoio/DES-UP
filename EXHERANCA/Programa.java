import java.util.List;
import java.util.ArrayList;

public class Programa {
    public static void main (String[] args){

        List<Bike> listaBikes = new ArrayList<>();

        // Bike bikeGenerica = new Bike();

        // BikeDeCorrida bikeCorrida = new BikeDeCorrida();
        Bike bikeCorrida = new BikeDeCorrida();
        // QuadroLeve qLeve = new QuadroLeve();
        Quadro qLeve = new QuadroLeve();
        bikeCorrida.setQuadro(qLeve);

        listaBikes.add(bikeCorrida);
        
        // BikeDeTrilha bikeTrilha = new BikeDeTrilha();
        Bike bikeTrilha = new BikeDeTrilha();
        // QuadroResistente qResistente = new QuadroResistente();
        Quadro qResistente = new QuadroResistente();
        bikeTrilha.setQuadro(qResistente);
        
        listaBikes.add(bikeTrilha);
        
        // BikeDePasseio bikePasseio = new BikeDePasseio();
        Bike bikePasseio = new BikeDePasseio();
        Bike bikeCarga = new BikeDeCarga();
        
        listaBikes.add(bikePasseio);
        listaBikes.add(bikeCarga);

        for (Bike bike : listaBikes) {
            System.out.println(bike);
        }
        
    }
}
