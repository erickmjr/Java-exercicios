package exercicio9;
import java.util.Scanner;
public class exercicio9 {

    public static double salarioLiquido(double valorHora, double qtdHoras, double desconto) {
        double salarioBruto = valorHora * qtdHoras;
        double salarioLiquido = salarioBruto - salarioBruto*(desconto/100);

        return salarioLiquido;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora aula:");
        double valorHora = scanner.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        double qtdHoras = scanner.nextDouble();

        System.out.println("Digite o percentual de desconto do INSS:");
        double desconto = scanner.nextDouble();

        double resultado = salarioLiquido(valorHora, qtdHoras, desconto);

        System.out.println("Salário Líquido: R$" + resultado);
    }
}
