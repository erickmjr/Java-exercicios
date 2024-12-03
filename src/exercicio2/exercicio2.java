package exercicio2;

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância (em Km) a ser percorrida: ");
        double distancia = scanner.nextDouble();

        System.out.println("Digite o valor do litro de gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double gasolinaNecessaria = distancia/12;
        double valorGasto = (gasolinaNecessaria*precoGasolina);
        System.out.println("Quantidade de gasolina necessária: " + gasolinaNecessaria + " litros.");
        System.out.println("Valor total a ser gasto: R$" + valorGasto);
    }
}
