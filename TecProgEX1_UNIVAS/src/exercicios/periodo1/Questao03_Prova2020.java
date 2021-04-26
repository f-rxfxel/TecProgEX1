package exercicios.periodo1;

import java.util.Scanner;

public class Questao03_Prova2020 {

	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		
		if ( (n + 1) % 5 == 0) {
			
			System.out.println(n + 1);
			
		} else if ( (n + 2) % 5 == 0) {
			
			System.out.println(n + 2);
		
		} else {
			
			System.out.println(n);
			
		}
	}
}