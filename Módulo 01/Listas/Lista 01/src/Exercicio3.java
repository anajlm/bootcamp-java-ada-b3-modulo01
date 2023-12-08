import java.util.Scanner;

public class Exercicio3 {

    /**
     * Suponha que precisamos trabalhar em um projeto da NASA que
     * pretende lançar um novo satélite. A economia de memória é
     * muito importante nessa missão, pois vamos ter uma quantidade
     * de memória limitada. Vamos trabalhar em 3 módulos e não
     * podemos ultrapassar o limite de memória de cada módulo. Ao
     * iniciar o programa o operador deve digitar os dados da missão
     * para que armazene todos os dados em cada um dos módulos e
     * no final deve ser printado todos os valores por ele escolhidos.
     *
     * a. Móludo 01 - Controle de tempo x funcionários:
     * i. Memória disponível: 3 bytes
     * ii. Requisitos: Armazenar o ano atual da missão (max
     * 9999), quantidade de funcionários envolvidos
     * (max 100).
     *
     * b. Móludo 02 - Controle de distância x velocidade:
     * i. Memória disponível: 6 bytesii.
     * Requisitos: Armazenar distancia que o satélite
     * ficará da terra (max 2 milhões), velocidade máxima
     * (max 30.000 km/h)
     *
     * c. Móludo 03 - Status da missão:
     * i. Memória disponível: 17 bytes
     * ii. Requisitos: Armazenar o estado da missão (se já
     * iniciou ou não), distância que será percorrida
     * durante a missão em km (max 3 bilhões de km) e
     * calibragem das antenas (número racional com
     * precisão de no mínimo 14 casa decimais).
     */

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
