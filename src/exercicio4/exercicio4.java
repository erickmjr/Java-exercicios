package exercicio4;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura do paciente: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37) {
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("A temperatura do paciente está normal.");
        }
    }
}
