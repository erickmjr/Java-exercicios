package exercicio1;

import java.util.Scanner;

public class horasTrabalhadas {
    public static double calcularSalario(double horas) {
        return (horas * 20);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas pelo colaborador: ");
        double horas = scanner.nextDouble();

        double resultado = calcularSalario(horas);

        System.out.println("O salário do colaborador trabalhando " + horas + " horas é de: R$" + resultado);
    }

}
