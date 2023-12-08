import java.util.Scanner;

public class Exercicio4 {

    /**
     * Faça um programa que calcula a área das seguites figuras
     * geometricas - Retângulo, Triângulo, Círculo e Trapézio.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a forma geométrica: ");
        System.out.println("1 - Triângulo");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Circulo");
        System.out.println("4 - Trapézio");
        int formaSelecionada = scanner.nextInt();

        String nomeFormaGeometrica = null;
        double area = 0;

        switch (formaSelecionada){
            case 1:
                nomeFormaGeometrica = "triângulo";

                System.out.println("Insira a base: ");
                double baseTriangulo = scanner.nextDouble();

                System.out.println("Insira a altura: ");
                double alturaTriangulo = scanner.nextDouble();

                area = (baseTriangulo * alturaTriangulo) / 2;
                break;

            case 2:
                nomeFormaGeometrica = "retângulo";

                System.out.println("Insira a base: ");
                double baseRetangulo = scanner.nextDouble();

                System.out.println("Insira a altura: ");
                double alturaRetangulo = scanner.nextDouble();

                area = baseRetangulo * alturaRetangulo;
                break;

            case 3:
                nomeFormaGeometrica = "circulo";

                System.out.println("Insira o raio: ");
                double raio = scanner.nextDouble();

                area = Math.PI * Math.pow(raio, 2);
                break;

            case 4:
                nomeFormaGeometrica = "trapezio";

                System.out.println("Insira a base maior: ");
                double baseMaiorTrapezio = scanner.nextDouble();

                System.out.println("Insira a base menor: ");
                double baseMenorTrapezio = scanner.nextDouble();

                System.out.println("Insira a altura: ");
                double alturaTrapezio = scanner.nextDouble();

                area = ((baseMaiorTrapezio + baseMenorTrapezio) * alturaTrapezio)/2;
                break;

            default:
                System.out.println("Opção inválida.");
        }

        System.out.printf("Area do %s: %.2f %n", nomeFormaGeometrica, area);


    }

}
