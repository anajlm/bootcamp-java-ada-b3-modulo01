public class Q1 {

    /**
     * Busca e Ordenação
     *
     * No dia a dia é comum trabalhar com conjuntos de dados e em
     * casos específicos é necessário usar algum padrão de organização
     * para melhor entender os dados. Como exemplo, podemos citar uma
     * chamada em classe, geralmente, esse procedimento segue o padrão da
     * ordem alfabética, uma forma de ordenação.
     *
     * Crie uma função que recebe um conjunto de dados (inteiros), faz a ordenação
     * dos dados de forma crescente e retorna o conjunto dos dados ordenados.
     * A função deverá ser criada seguindo a estrutura abaixo:
     */
    public static void main(String[] args) {
        int[] arrayOrdenado = ordenar(new int[]{3,5,6,2,1,4});

        for(int e : arrayOrdenado){
            System.out.print(e + " ");
        }
    }

        public static int[] ordenar(int[] input) {

            for(int i=0; i<input.length; i++){
                for(int j=i; j<input.length; j++){
                    if(input[j] < input[i]){
                        int aux = input[i];
                        input[i] = input[j];
                        input[j] = aux;
                    }
                }
            }
            return input;
        }

}
