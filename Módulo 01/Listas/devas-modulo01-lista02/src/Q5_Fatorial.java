import java.util.Scanner;

public class Q5_Fatorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int entrada = scanner.nextInt();

        int fatorial = 1;

        for(int i=entrada; i>1; i--){
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d.%n", entrada, fatorial);
    }
}