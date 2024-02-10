import java.util.Scanner;
public class Q3_MediaNotas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas que deseja calcular a média: ");
        int numNotas = scanner.nextInt();

        int somaNotas = 0;

        for(int i=1; i<=numNotas; i++){
            System.out.printf("Informe a nota %d: %n", i);
            double nota = scanner.nextDouble();

            somaNotas += nota;
        }

        double media = somaNotas/numNotas;
        System.out.println("A média das notas é igual a " + media);
    }

}