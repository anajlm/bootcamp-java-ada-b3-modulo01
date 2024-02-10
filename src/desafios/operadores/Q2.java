public class Q2 {

    /**
     * João é um empresário do ramo de construção civil e decidiu adotar novos critérios para dar
     * reajuste salarial para seus funcionários. Agora, o reajuste vai ser dado seguindo as regras
     * abaixo.
     *
     * Tempo de serviço:
     *
     *     de 1 até 5 anos => 1%
     *     de 5 até 10 anos => 1.5%
     *     10 ou mais anos => 2% valor da inflação (IPCA)
     *
     * O valor total percentual para o reajuste vai ser a soma do percentual de tempo de serviço
     * mais o percentual da inflação.
     *
     * Para ajudar João a calcular o valor do reajuste salarial de seus funcionários, crie uma
     * função que recebe um array como entrada; onde, a posição 0 do array é o tempo de serviço,
     * a posição 1 é o valor da inflação e a posição 3 é o salário do funcionário. Sua função deve
     * calcular o novo salário e retorna-lo. Considere arredondamento de duas casas decimais para
     * o salário retornado.
     *
     * Ex:
     * Entrada: [1, 5.0, 2000.00]
     * Saída: 2120.00
     *
     * Ex:
     * Entrada: [11,4.5,2500.00]
     * Saída: 2662.50
     */

    public static void main(String[] args) {
        System.out.println(calculoSalario(new double[]{11,4.5,2500.00}));
    }
    public static double calculoSalario(double[] input)
    {
        double novoSalario;

        double tempoServico = input[0];
        double valorInflacao = input[1]/100.0;
        double salarioAtual = input[2];

        double percentualReajuste;

        if(tempoServico >=1.0 && tempoServico < 5.0){
            percentualReajuste = 0.01 + valorInflacao;
        } else if (tempoServico >= 5.0 && tempoServico < 10.0) {
            percentualReajuste = 0.015 + valorInflacao;
        } else if (tempoServico >= 10.0) {
            percentualReajuste = 0.02 + valorInflacao;
        } else{
            percentualReajuste = 0;
        }

        novoSalario = salarioAtual * (1 + percentualReajuste);

        return Math.round(novoSalario * 100.0) / 100.0;
    }
}
