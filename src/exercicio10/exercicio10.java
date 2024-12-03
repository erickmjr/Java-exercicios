package exercicio10;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        if (soma > 10) {
            System.out.println(soma);
        }

    }
}
