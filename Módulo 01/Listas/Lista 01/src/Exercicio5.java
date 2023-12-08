import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua altura em metros: ");
        double altura = entrada.nextDouble();

        System.out.println("Informe seu peso em kg: ");
        double peso = entrada.nextDouble();

        double imc = peso/(altura*altura);
        System.out.printf("O valor do seu IMC é: %.2f %n", imc);
    }
}
