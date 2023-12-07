import java.util.Scanner;

public class DesafioSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira sua nota: ");
        int nota = scanner.nextInt();

        char conceito = ' ';

        switch (nota/10){
            case 10:
            case 9:
                conceito = 'A';
                break;
            case 8:
                conceito = 'B';
                break;
            case 7:
                conceito = 'C';
                break;
            case 6:
                conceito = 'D';
                break;
            default:
                conceito = 'Z';
        }

        System.out.println("O conceito é: " + conceito);
    }

}
