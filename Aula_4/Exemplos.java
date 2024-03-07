
/************************************************************************************
 * AULA: Programação Básica Java
 * 
 * 1. Tipos de variáveis var, int, short, long, float, double, bool e String;
 * 2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;
 * 3. Estruturas de decisão if/else, ternárias e switch;
 * 4. Estruturas de repetição while, do/while, for, for avançado;
 * 5. Arrays.
 * 
 ***********************************************************************************/
public class Exemplos {

  public static void imprimir(String str){
    System.out.println(str);
  }
  public static void main(String[] args) {

    // 1. Tipos de variáveis var, int, short, long, float, double, bool e string;
    // 2. Operadores de atribuição, aritméticos, relacionais, lógicos e unários;

    int a = 15;
    var b = 10; // inferência de tipo dinâmico (fracamente tipado)
    short c = 5;
    var d = 10;
    float e = 10.5f;
    double f = 10.5;
    boolean g = true;
    String h = "Olá, mundo!";

    // imprimir("O valor da variável a é: " + a);
    System.out.printf("O valor da variável a é: %d%n", a);

    System.out.printf("O valor da variável b é: %d%n", b);

    System.out.printf("O valor mínimo de int é %d e o valor máximo é %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);
    System.out.printf("O valor mínimo de short é %d e o valor máximo é %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
    System.out.printf("O valor mínimo de long é %d e o valor máximo é %d%n", Long.MIN_VALUE, Long.MAX_VALUE);
    System.out.printf("O valor mínimo de float é %f e o valor máximo é %f%n", Float.MIN_VALUE, Float.MAX_VALUE);
    System.out.printf("O valor mínimo de double é %f e o valor máximo é %f%n", Double.MIN_VALUE, Double.MAX_VALUE);

    imprimir("------->>> A + B: " + Calculadora.somar(a, b));
    imprimir("A - B: " + Calculadora.subtrair(a, b));
    imprimir("A * B: " + Calculadora.multiplicar(a, b));
    imprimir("A / B: " + Calculadora.dividir(a, b));
    imprimir("A % B: " + (a % b));
    imprimir("A + B x C: " + (a + b * c));
    imprimir("(A + B) x C: " + ((a + b) * c));

    // Operadores aritméticos de atribuição (=, *=, /=, +=, -=)
    imprimir("d += a: " + (d += a));
    imprimir("d -= a: " + (d -= a));
    imprimir("d *= a: " + (d *= a));
    imprimir("d /= a: " + (d /= a));

    // Operadores relacionais (==, !=, <, >, <=, >=) e lógicos (!, &&, ||) e unários
    // (++, --):
    imprimir("A == B: " + (a == b));
    imprimir("A != B: " + (a != b));
    imprimir("A < B: " + (a < b));
    imprimir("A > B: " + (a > b));
    imprimir("A <= B: " + (a <= b));
    imprimir("A >= B: " + (a >= b));

    imprimir("A é igual a B e C é maior do A: " + (a == b && c > a));
    // b = 15;
    // c = 25;
    imprimir("A é igual a B ou A é maior do C: " + (a == b || c > a));

    // 3. Estruturas de decisão if/else, ternárias e switch/array;
    System.out.printf("Valores A = %d, B = %d, C = %d %n", a, b, c);

    if (a == b) {
      imprimir("A == B");
    } else {
      imprimir("A != B");
    }

    var msg = a == b ? "A == B" : "A != B";
    imprimir(msg);

    int[] dias = new int[] { 2, 3, 4, 5, 6 };
    try {
      switch (dias[6]) {
        case 2:
          imprimir("Segunda-feira");
          break;
        case 3:
          imprimir("Terça-feira");
          break;
        case 4:
          imprimir("Quarta-feira");
          break;
        case 5:
          imprimir("Quinta-feira");
          break;
        case 6:
          imprimir("Sexta-feira");
          break;
        default:
          imprimir("É final de semana!");
          break;
      }
    } catch (Exception ex) {
      imprimir("Deu algum erro...");
    }

    // 4. Estruturas de repetição while, do/while, for, for avançado;
    // 5. Arrays.

    boolean executar = true;
    int contador = 0;
    String[] nomes = new String[] { "João", "Pedro", "Paulo", "Tiago", "Ana", "Maria" };

    imprimir("------while--------");
    while (executar && contador < nomes.length) {
      var nome = nomes[contador];
      imprimir(nome);
      contador++;
    }

    contador = 0;
    imprimir("-----do/while--------");
    do {
      var nome = nomes[contador];
      imprimir(nome);
      contador++;
    } while (executar && contador < nomes.length);

    imprimir("-------for--------");
    for (int i = 0; i < nomes.length; i++) {
      var nome = nomes[i];
      imprimir(nome);
    }

    imprimir("-------for avançado--------");
    for (var nome : nomes) {
      imprimir(nome);
    }

  }

}
