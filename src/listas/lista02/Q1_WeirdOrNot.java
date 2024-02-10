import java.util.Scanner;

public class Q1_WeirdOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int x = scanner.nextInt();

        if(x % 2 != 0) {
            System.out.println("Weird");
        } else {
            if(x>=2 && x<=5){
                System.out.println("Not Weird");
            } else if (x>=6 && x<=20) {
                System.out.println("Weird");
            } else if (x > 20) {
                System.out.println("Not Weird");
            }
        }

    }
}
