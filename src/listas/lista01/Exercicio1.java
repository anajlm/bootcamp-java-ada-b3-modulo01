import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira sua profissão: ");
        String profissao = scanner.nextLine();

        System.out.print("Nome: " + nome + "\n");
        System.out.printf("Idade: %s %n", idade);
        System.out.println("Profissão: " + profissao);
    }
}
