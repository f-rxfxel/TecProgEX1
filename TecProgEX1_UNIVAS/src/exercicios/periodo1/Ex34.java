package exercicios.periodo1;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int[] turma1 = new int[30];
		int[] turma2 = new int[30];
		
		System.out.println("TURMA 1");
		
		int somaT1 = 0;
		
		for(int i = 0, contador = 0; i < 30; i++, contador++) {
			System.out.println("Digite a " + (contador + 1) + "ª nota:");
			turma1[i] = input.nextInt();
			somaT1 += turma1[i];
		}
		
		System.out.println("TURMA 2");
		
		int somaT2 = 0;
		
		for(int i = 0, contador = 0; i < 30; i++, contador++) {
			System.out.println("Digite a " + (contador + 1) + "ª nota:");
			turma2[i] = input.nextInt();
			somaT2 += turma2[i];
		}
		
		System.out.println("A média da turma 1 foi de " + (somaT1 / 30));
		System.out.println("A média da turma 2 foi de " + (somaT2 / 30));
		System.out.println("A média das duas turmas foi de " + ((somaT1 + somaT2) / 60));
		
	}
}