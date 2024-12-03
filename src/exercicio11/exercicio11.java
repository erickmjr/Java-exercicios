package exercicio11;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1° número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o 2° número:");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        if (soma >= 10) {
            soma = soma + 5;
            System.out.println("Soma dos valores + 5: " + soma);
        } else {
            soma = soma - 7;
            System.out.println("Soma dos valores - 7: " + soma);
        }
    }
}
