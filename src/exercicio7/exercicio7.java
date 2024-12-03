package exercicio7;
import java.util.Scanner;
public class exercicio7 {

    public static double calcularImc(double peso, double altura) {
        return peso/(altura*altura);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (Kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura(Metros):");
        double altura = scanner.nextDouble();

        double IMC = calcularImc(peso, altura);

        if (IMC > 30) {
            System.out.println("Usuário em quadro de obesidade.");
        } else {
            System.out.println("Usuário não se encontra em quadro de obesidade.");
        }
    }
}
