package Mini_projetos;
import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);
        System.out.println("Nome: " + nome);
        System.out.println("Seu IMC é: " + IMC);
    }
}