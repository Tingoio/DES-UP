public class BikeDeCarga extends Bike {

    public BikeDeCarga(){
        super("Bike de carga", 120);
    }

    @Override //Sobrescrita
    public int getCarga() {
        return carga;
    }
    
}
