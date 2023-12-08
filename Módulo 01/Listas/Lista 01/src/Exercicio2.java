import java.util.Scanner;

public class Exercicio2 {

    /**
     * Escreva um programa que captura nome, salário, idade, altura e
     * sexo. Mostre na tela utilizando o printf.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Insira seu salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira sua altura: ");
        double altura = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Insira seu sexo: ");
        String sexo = scanner.nextLine();

        System.out.printf("Nome: %s %n", nome);
        System.out.printf("Salário: R$ %.2f %n", salario);
        System.out.printf("Idade: %d anos %n", idade);
        System.out.printf("Altura: %.2fm %n", altura);
        System.out.printf("Sexo: %s %n", sexo);
    }
}
