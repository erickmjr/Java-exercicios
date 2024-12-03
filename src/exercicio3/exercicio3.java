package exercicio3;

import java.util.Scanner;
public class exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("O usuário já pode tirar carteira de motorista.");
        } else {
            System.out.println("O usuário ainda não pode tirar carteira de motorista.");
        }
    }
}
