package exercicio5;
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        double n1 = scanner.nextDouble();

        System.out.println("Digite outro número:");
        double n2 = scanner.nextDouble();

        if (n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }

    }
}
