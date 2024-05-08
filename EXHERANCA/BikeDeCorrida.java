public class BikeDeCorrida extends Bike {

    public BikeDeCorrida(){
        super("Bike de corrida", 60);
    }

    @Override //Sobrescrita
    public int getCarga() {
        return carga;
    }
    
}
