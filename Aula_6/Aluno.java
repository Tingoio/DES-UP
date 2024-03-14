public class Aluno{
    public static void main(String[] args) {
        
        //Uso de uma biblioteca de funções (static)
        double a = 100;
        double b = 50;
        double r = Calculadora.somar(a, b);

        //Uso de objeto + método
        Bike objBike = new Bike();
        objBike.trocarDeMarcha(5);
        System.out.println(objBike.numeroMarcha);
    }
}