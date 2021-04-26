package exercicios.periodo1;

import java.util.Scanner;

public class Questao01_Prova2020 {

	public static void main (String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int n1, n2, n3, n4, i = 0;

		System.out.println("Digite 4 números: ");

		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		n4 = input.nextInt();

		if (n1 < 0) {

			++i;

		}

		if (n2 < 0) {

			++i;

		}

		if (n3 < 0) {

			++i;

		}

		if (n4 < 0) {

			++i;

		}

		System.out.println("Você digitou " + i + " número(s) negativo(s).");
		
	}
}