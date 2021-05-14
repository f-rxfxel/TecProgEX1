package exercicios.periodo1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		String nome, NOME = "";
		int idade, IDADE = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 3; i++) {

			System.out.println("Digite o nome: ");
			nome = input.next();

			System.out.println("Digite o ano de nascimento: ");
			idade = input.nextInt();

			idade = 2021 - idade;

			if (idade > IDADE) {

				NOME = nome;
				IDADE = idade;
			}
		}

		System.out.println("O mais velho é " + NOME + " com " + IDADE + " anos.");

		input.close();
	}
}