public class Q2 {

    public static void main(String[] args) {
        System.out.println(geraRecibo(new double[]{20.0, 40.0, 30.0}));
    }

    /**
     * Arrays, Ordenação, Operações aritméticas
     *
     * Uma loja de roupas decidiu aquecer suas vendas lançando uma promoção
     * com descontos especiais para clientes que comprassem mais de uma peça.
     * As condições da promoção dizem que, na compra de duas peças, será dado
     * 50% de desconto na peça de menor de valor.
     *
     * Escreva uma função que receba um array contendo o preço das peças de um
     * cliente e calcule o valor total sem descontos, o valor total de descontos,
     * e o valor total a pagar. A saída da função deve ser uma string.
     *
     * Ex:
     * Entrada: [20.0, 40.0]
     * Saída: Valor total: 60.0 | Valor de descontos: 10.0 | Valor a pagar: 50.0
     *
     * Ex:
     * Entrada: [20.0, 40.0, 30.0]
     * Saída: Valor total: 90.0 | Valor de descontos: 10.0 | Valor a pagar: 80.0
     *
     * Ex:
     * Entrada: [20.0, 80.0, 60.0, 40.0]
     * Saída: Valor total: 200.0 | Valor de descontos: 10.0 | Valor a pagar: 190.0
     */


     public static String geraRecibo(double[] input)
     {
            double valorTotal = 0;
            double valorDescontos = 0;
            double valorAPagar;

            double minValor = input[0];

            for(int i=0; i<input.length; i++){
                valorTotal += input[i];

                if(input[i] < minValor){
                    minValor = input[i];
                }

            }
            if(input.length >= 2){
                valorDescontos = minValor * 0.5;
            }

            valorAPagar = valorTotal - valorDescontos;

         return "Valor total: " + valorTotal + " | Valor de descontos: " + valorDescontos + " | Valor a pagar: " + valorAPagar;
     }

}
