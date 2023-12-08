import calculadora.Calculadora;

import java.util.Scanner;

public class Main {

    /**
     *
     * Criar um carro com os atributos:
     *  - cor
     *  - marca
     *  - modelo
     *  - ligado
     *  - velocidadeAtual
     *
     * Enquanto o carro estiver ligado deve ser capaz de:
     * - Ligar/Desligar
     * - Acelerar
     * - Frear
     * - Motrar estado atual
     *
     * Regras:
     * - Só podemos desligar o carro quando ele parar (velocidadeAtual = 0)
     * - Só podemos realizar as ações com o carro ligado
     * - A velocidade máxima do nosso carro é de 100km/h
     * - Não existe velocidade negativa
     * - Acelerar + 10km/h (Aumenta 10)
     * - Frear - 10km/h (Diminui 10)
     *
     */

    // TODO: Implementar regras
    // - A velocidade máxima do nosso carro é de 100km/h
    // - Não existe velocidade negativa

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // new - criamos um objeto
        Carro carro = new Carro();
        carro.cor = "Azul";
        carro.marca = "Ferrari";
        carro.modelo = "296 GTB";
        carro.ligado = true;
        carro.velocidade = 0;

        int escolha;

        while(carro.ligado) { // Enquanto meu carro estiver ligado ->
            mostrarMenu();
            escolha = entrada.nextInt(); // Entrada do usuario


            switch (escolha){
                case 0:
                    carro.desligar();
                    break;
                case 1:
                    carro.acelerar();
                    break;
                case 2:
                    carro.frear();
                    break;
                case 3:
                    carro.mostrarEstadoAtual();
                    break;
                default:
                    System.out.println("Opção inválida");

            }

        }

        entrada.close();
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Acelerar");
        System.out.println("2 - Frear");
        System.out.println("3 - Estado atual");
        System.out.println("0 - Desligar");
        System.out.printf("Operacao: ");
        System.out.println();
    }


}
