package exercicios.periodo1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int A, B, C, D;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("(A * B) - (C * D) | Digite o produto A: ");
		A = input.nextInt();
		
		System.out.println("(A * B) - (C * D) | Digite o produto B: ");		
		B = input.nextInt();
		
		System.out.println("(A * B) - (C * D) | Digite o produto C: ");
		C = input.nextInt();
		
		System.out.println("(A * B) - (C * D) | Digite o produto D: ");
		D = input.nextInt();

		System.out.println("O produto é " + ((A * B) - (C * D)));
		
		input.close();
	}
}