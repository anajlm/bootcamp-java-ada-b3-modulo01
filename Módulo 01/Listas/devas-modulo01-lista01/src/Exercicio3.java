import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Módulo 01: ");
        System.out.println("Insira o ano atual da missao: ");
        short anoMissao = scanner.nextShort();
        scanner.nextLine();

        System.out.println("Insira a quantidade de funcionários envolvidos: ");
        byte numFuncionarios = scanner.nextByte();
        scanner.nextLine();

        // Módulo 02:
        System.out.println("Módulo 02: ");

        System.out.println("Insira a distância que o satélite ficará da terra: ");
        int distanciaDaTerra = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Insira a velocidade máxima: ");
        short velMaxima = scanner.nextShort();

        // Módulo 03:
        System.out.println("Módulo 03: ");

        System.out.println("Insira o estado da missao: ");
        boolean estadoMissao = scanner.nextBoolean();
        scanner.nextLine();

        System.out.println("Insira a distância que será percorrida durante a missão: ");
        long distanciaMissao = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Insira a calibragem das antenas: ");
        double calibragemAntenas = scanner.nextDouble();
        scanner.nextLine();


        /******************* Printa os valores de cada módulo ************************/

        System.out.println("Módulo 01: ");
        System.out.println("Ano atual da missão: " + anoMissao);
        System.out.println("Quantidade de funcionários envolvidos: " + numFuncionarios);
        System.out.println();

        System.out.println("Módulo 02: ");
        System.out.println("Distância que o satélite ficará da terra: " + distanciaDaTerra);
        System.out.println("Velocidade máxima: " + velMaxima);
        System.out.println();

        System.out.println("Módulo 03: ");
        System.out.println("Estado da missao: " + estadoMissao);
        System.out.println("Distância que será percorrida durante a missão: " + distanciaMissao);
        System.out.println("Calibragem das antenas: " + calibragemAntenas);
    }
}
