package exercicios.periodo1;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int[] a1 = new int[10];
		int[] a2 = new int[10];
		int[] a3 = new int[10];
		
		System.out.println("-=| Array 1 |=-");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			a1[i] = input.nextInt();		
			}
		
		System.out.println("-=| Array 2 |=-");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			a2[i] = input.nextInt();		
			}
		
		System.out.println("-=| Array 1 × Array 2 |=-");
		
		for (int i = 0; i < 10; i++) {
			a3[i] = a1[i] * a2[i];
			System.out.println(a3[i]);
			}
		
		input.close();
	}
}