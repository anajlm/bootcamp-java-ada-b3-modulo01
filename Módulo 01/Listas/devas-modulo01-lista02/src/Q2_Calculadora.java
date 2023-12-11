import java.util.Scanner;

public class Q2_Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione a operação desejada: ");
        System.out.println("  i. Somar");
        System.out.println(" ii. Subtrair");
        System.out.println("iii. Dividir");
        System.out.println(" iv. Multiplicar");
        System.out.println("  v. Resto");
        System.out.println(" vi. Raiz");
        System.out.println("vii. Potência");
        String operacaoDesejada = scanner.nextLine();

        System.out.println("Insira o primeiro número: ");
        double a = scanner.nextDouble();

        System.out.println("Insira o segundo número: ");
        double b = scanner.nextDouble();

        double resultado = 0;
        String operador = "";

        switch (operacaoDesejada) {
            case "i":
                operador = "+";
                resultado = a + b;
                break;
            case "ii":
                operador = "-";
                resultado = a - b;
                break;
            case "iii":
                operador = "/";
                if (b == 0){
                    System.out.println("Erro - não é possível fazer divisão por 0.");
                    break;
                }
                resultado = a / b;
                break;
            case "iv":
                operador = "*";
                resultado = a * b;
                break;
            case "v":
                operador = "%";
                resultado = a % b;
                break;
            case "vi":
                operador = "^";
                double exp = 1/b; // o expoente é o inverso do radical, ex.: a^(1/b)
                resultado = Math.pow(a, exp);
                break;
            case "vii":
                operador = "^";
                resultado = Math.pow(a, b);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.printf("%.2f %s %.2f = %.2f", a,  operador, b, resultado);

    }

}
