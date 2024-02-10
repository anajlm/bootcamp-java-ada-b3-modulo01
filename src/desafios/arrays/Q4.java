public class Q4 {

    /**
     * Crie uma função que recebe um array de valores decimais e identifique se dentre o
     * conjunto dos dados existem valores repetidos. Caso os valores sejam todos distintos
     * retorne false, senão true.
     *
     * Ex:
     * Entrada: [2.5, 3.2, 4.5, 5, 6]
     * Saída: false
     *
     * Ex:
     * Entrada: [2,2,3.1,4,4.1,4.1]
     * Saída: true
     */

    public static void main(String[] args) {
        System.out.println(elementosRepetidos(new double[]{2,2,3.1,4,4.1,4.1}));
    }
    public static boolean elementosRepetidos(double[] input)
    {
        for(int i=0; i<input.length; i++){
            for(int j=0; j<input.length; j++){
                if(i != j) {
                    if (input[i] == input[j]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
