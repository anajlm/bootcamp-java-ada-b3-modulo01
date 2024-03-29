public class Q3 {

    /**
     * Dentro dos conjuntos numéricos existem vários subconjuntos, dentre eles
     * os subconjuntos dos números pares e números ímpares. Os números pares são
     * todos os números múltiplos de 2, enquanto os números ímpares são o números
     * não pares, logo, são os números que não são múltiplos de 2. Esse conjunto
     * de números terminam com algum dos algarismos 1, 3, 5, 7 ou 9.
     *
     * Crie uma função que recebe um array de números inteiros, identifica os números
     * como pares ou ímpares e retorna uma string informando a quantidade de pares seguido
     * de uma vírgula e depois a quantidade de impares.
     *
     * Ex:
     * Entrada: 1,2,3,6,9
     * Saída: 3 pares, 3 ímpares
     *
     * Ex:
     * Entrada: 2,3,6
     * Saída: 2 pares, 1 ímpar
     *
     */

    public static void main(String[] args) {
        System.out.println(parImpar(new int[]{1,2,3,6,9}));
    }
    public static String parImpar(int[] input)
    {
        int pares = 0;
        int impares = 0;

        for(int i=0; i<input.length; i++){
            if(input[i] % 2 == 0){
                pares++;
            } else{
                impares++;
            }
        }

        return pares + " pares, " + impares + " ímpares";
    }

}
