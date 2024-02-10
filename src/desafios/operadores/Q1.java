public class Q1 {

    /**
     * Pedrinho trabalha com vendas de carro. Mensalmente ele recebe um salário fixo
     * e comissões baseadas em suas vendas. As comissões são as seguintes
     *
     * Comissões:
     *
     *     5% sobre o valor total vendido no mês
     *     valor fixo por cada carro vendido
     *
     * Faça uma função que recebe um array com: número de carros por ele vendidos no mês,
     * o valor total de suas vendas no mês, seu salário fixo, valor fixo que ele recebe por
     * carro vendido. Calcule e retorne qual o salário dele (salário fixo mais comissões).
     * Arredonde o valor de retorno para duas casas decimais.
     *
     * Ex:
     * Entrada: [3, 20000.00, 2000.00, 250.00]
     * Saída: 3750.00
     *
     * Ex:
     * Entrada: [4,25000.00, 3500.00, 100.00]
     * Saída: 5150.00
     */

    public static void main(String[] args) {
        System.out.println(salarioComComissao(new double[]{4,25000.00, 3500.00, 100.00}));
    }
    public static double salarioComComissao( double[] input)
    {
        double salarioComComissao = 0;

        double numCarrosVendidos = input[0];
        double valorVendasDoMes = input[1];
        double salarioFixo = input[2];
        double valorFixoPorCarroVendido = input[3];

        salarioComComissao = salarioFixo + valorVendasDoMes*0.05 + numCarrosVendidos*valorFixoPorCarroVendido;

        return salarioComComissao;
    }

}
