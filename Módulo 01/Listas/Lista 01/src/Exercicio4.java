import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a forma geométrica: ");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Circulo");
        System.out.println("4 - Trapézio");

        int forma = scanner.nextInt();
        double area = 0;

        switch (forma){
            case 1:
                System.out.println("Insira a base: ");
                double base = scanner.nextDouble();
                System.out.println("Insira a altura: ");
                double altura = scanner.nextDouble();

                area = (base * altura) / 2;

            case 2:
                System.out.println("Insira a base: ");
                base = scanner.nextDouble();
                System.out.println("Insira a altura: ");
                altura = scanner.nextDouble();

                area = base * altura;

            case 3:
                System.out.println("Insira o raio: ");
                double raio = scanner.nextDouble();

                area = Math.PI * Math.pow(raio, 2);

            case 4:
                System.out.println("Insira a base maior: ");
                double baseMaior = scanner.nextDouble();
                System.out.println("Insira a base menor: ");
                double baseMenor = scanner.nextDouble();
                System.out.println("Insira a altura: ");
                altura = scanner.nextDouble();

                area = (baseMaior + baseMenor) * altura * 0.5;
        }

        System.out.println("Area: " + area);


    }

}
