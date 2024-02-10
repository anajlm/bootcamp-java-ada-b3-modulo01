import java.util.Scanner;

public class Q4_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int num = scanner.nextInt();

        for(int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d %n", num, i, (num*i));
        }

    }
}