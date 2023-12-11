public class Q5_Combustivel {

    public static void main(String[] args) {
        calculaGastoCombustivel(3.0, 100.0);
    }

    public static double calculaGastoCombustivel(double horasDeViagem, double velocidadeMedia){
        final double KM_POR_LITRO = 12.0;

        double distanciaPercorrida = velocidadeMedia * horasDeViagem;

        double litrosDeCombustivel = distanciaPercorrida / KM_POR_LITRO;

        System.out.printf("Foram gastos %.3f litros de combustível na viagem. %n", litrosDeCombustivel);

        return litrosDeCombustivel;

    }

}
