public class Q4_Salario {

    public static void main(String[] args) {
        calculaSalarioAnual("Ana", 160.0, 50.00);
    }
    public static double calculaSalarioAnual(String nome, double horasTrabalhadasPorMes, double valorHora){
        double salarioAnual =  12 * horasTrabalhadasPorMes * valorHora;

        System.out.printf("O salário anual de %s é igual a R$ %.2f. %n", nome, salarioAnual);

        return salarioAnual;
    }
}
