import java.util.Scanner;

public class Q1_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação desejada: ");
        System.out.println("  i. Somar");
        System.out.println(" ii. Subtrair");
        System.out.println("iii. Dividir");
        System.out.println(" iv. Multiplicar");
        String operacaoDesejada = scanner.nextLine();

        System.out.println("Insira o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        double b = scanner.nextDouble();

        double resultado = 0;

        switch (operacaoDesejada) {
            case "i":
                resultado = somar(a, b);
                break;
            case "ii":
                resultado = subtrair(a, b);
                break;
            case "iii":
                if (dividir(a, b) != -1){
                    resultado = dividir(a, b);
                }
                break;
            case "iv":
                resultado = multiplicar(a, b);
                break;
            default:
                System.out.println("Operação inválida.");
                System.exit(0);
        }

        System.out.println("Resultado = " + resultado);
    }


    public static double somar(double a, double b){
        return a + b;
    }

    public static double subtrair(double a, double b){
        return a - b;
    }

    public static double dividir(double a, double b){
        if(b == 0){
            System.out.println("Erro - não é possível fazer divisão por 0.");
            return -1;
        }
        return a / b;
    }

    public static double multiplicar(double a, double b){
        return a * b;
    }

}
