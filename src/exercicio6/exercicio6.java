package exercicio6;
import java.util.Scanner;
public class exercicio6 {

    public static double calcularMedia(double nota1, double nota2, double trabalho) {
        double resultado = (nota1 + nota2 + trabalho) / 3;
        return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota da AV1:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota da AV2:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota do trabalho:");
        double trabalho = scanner.nextDouble();

        double resultado = calcularMedia(nota1, nota2, trabalho);

        if (resultado >= 7) {
            System.out.println("Aprovado!\nMédia: " + resultado);
        } else{
            System.out.println("Reprovado!\nMédia: " + resultado);
        }
    }
}
