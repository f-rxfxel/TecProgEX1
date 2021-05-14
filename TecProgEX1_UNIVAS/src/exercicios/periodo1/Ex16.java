package exercicios.periodo1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		int nota, notas = 0;

		Scanner input = new Scanner(System.in);

		for (int i = 1; i <= 30; i++) {

			System.out.println("Digite a nota: ");
			nota = input.nextInt();
			
			notas = nota + notas;
		}
		
		System.out.println("A média é " + notas / 30);
		
		input.close();
	}
}