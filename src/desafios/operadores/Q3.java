public class Q3 {

    /**
     * Maria está olhando o mercado de automóveis para comprar um carro novo.
     * Ela identificou que o preço final do veiculo tem um percentual relacionado
     * ao distribuidor e também um percentual de impostos. Ela deseja identificar
     * qual veículo possui os menores percentuais de imposto e do distribuidor, para
     * fazer a escolha de seu carro novo.
     *
     * Para ajudar Maria com a sua busca, crie uma função que receba um array com o preço
     * de final de fábrica, o valor do custo com o distribuidor e o valor do preço dos impostos.
     * Ao final, a função deve retornar um array com o percentual do custo do distribuidor e o
     * percentual do custo com os impostos, seguindo essa ordem. Realize o arredondamento para duas
     * casas decimais em relação aos dados de retorno.
     *
     * Ex:
     * Entrada: [100000.00, 12000.00, 20000.00]
     * Saída: [12.00, 20.00]
     *
     * Ex:
     * Entrada: [115500.00,25000.00, 32500.00]
     * Saída: [21.64, 28.14]
     */

    public static void main(String[] args) {
        double[] custoCarro = custosCarro(new double[]{115500.00,25000.00, 32500.00});

        for (double d : custoCarro){
            System.out.print(d + " ");
        }
    }

    public static double[] custosCarro(double[] input)
    {
        double percentualCustoDistribuidor = Math.round((100 * (input[1] / input[0]) * 100.0)) / 100.0;
        double percentualValorImpostos =  Math.round((100 * (input[2] / input[0]) * 100.0)) / 100.0;

        return new double[]{percentualCustoDistribuidor, percentualValorImpostos};

    }
}
