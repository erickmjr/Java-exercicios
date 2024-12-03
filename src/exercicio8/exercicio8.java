package exercicio8;
import java.util.Scanner;

public class exercicio8 {

    public static double area(double raio) {
        double resultado = 3.14*(raio*raio);
        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = area(raio);

        System.out.println("Área da circunferência: " + area);
    }
}
