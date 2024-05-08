
public class BikeDeTrilha extends Bike {
    
    public BikeDeTrilha(){
        super("Bike de trilha", 80);
        // setTipo("Bike de trilha");
        // setCarga(80);
    }

    @Override //Sobrescrita
    public int getCarga() {
        // return super.getCarga();
        return carga;
    }
}
