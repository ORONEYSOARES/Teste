package Mini_projetos;
import java.util.Scanner;

public class Saberidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade atual: ");
        int idade = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        int anoAtual = scanner.nextInt();

        int anoNas = anoAtual - idade;
        System.out.println("Você nasceu em " + anoNas);
    }
}
