public class BikeDePasseio extends Bike {
    
    public BikeDePasseio(){
        super("Bike de corrida", 50);
    }

    @Override //Sobrescrita
    public int getCarga() {
        return carga;
    }

}
