package exercicios.periodo1;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		int array[] = new int[50];

		System.out.println("Digite 50 números:");
		
		for (int i = 0; i < 50; i++) {
			array[i] = input.nextInt();
			}
		
		int k = 0;
		
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
			if((array[i] == array[j]) && (i != j)) {
				k++;
					}
				}
			}
		
		System.out.println("Foram digitados " + k + " números repetidos.");
		
		input.close();	
	}
}