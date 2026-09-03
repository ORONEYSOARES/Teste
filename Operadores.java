public class Operadores {
    public static void main(String[] args) {
        
        mostrarOperadoresAritimeticos();

        System.out.println("_________________________");

        mostrarOperadoresRelacionais();

        System.out.println("_________________________");

        mostrarOperadoresLogicos();

    }

    public static void mostrarOperadoresAritimeticos() {
        int a = 10;
        int b = 5;

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Resto da divisão: " + (a % b));
    }

    public static void mostrarOperadoresRelacionais() {
        int x = 10;
        int y = 20;

        System.out.println("X e igual a Y " + (x == y));
        System.out.println("X e diferente de Y " + (x != y));
        System.out.println("X e maior que Y " + (x > y));
        System.out.println("X e menor que Y " + (x < y));
        System.out.println("X e maior ou igual " + (x >= y));
        System.out.println("X e menor ou igual " + (x <= y));
    }

    public static void mostrarOperadoresLogicos() {
        int idade = 18;

        boolean temCarteira = true;
        boolean podeDirigir = (idade >=18) && temCarteira;
        boolean podeViajarSozinho = (idade >= 18) || temCarteira;
        boolean naoTemCarteira = !temCarteira;

        System.out.println("Pode dirigir? " + podeDirigir);
        System.out.println("Pode viajar sozinho? " + podeViajarSozinho);
        System.out.println("Tem carteira? " + naoTemCarteira);
    }

    
}
