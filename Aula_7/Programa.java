public class Programa {
    public static void main(String[] args){

        //PROGRAMAÇÃO ESTRUTURADA
        String[] modelos = {"Mille", "California"};
        int[] velocidades = {80, 300};
        String[] nomes = {"Pedro", "James", "Rafael"};
        int[] alturas = {175, 175, 180};

        //PROGRAMAÇÃO ORIENTADA A OBJETOS

        Carro uno = new Carro();
        uno.modelo = "Mille";
        uno.velocidade = 80;

        Carro ferrari = new Carro();
        ferrari.modelo = "California";
        ferrari.velocidade = 300;
        
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
