package exercicios.periodo1;

import java.util.Scanner;

public class Ex25 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int soma = 0, i = 0;
		
		while (true) {
			
			System.out.println("Digite um número: ");
			int n = input.nextInt();
			
			if (n % 2 == 0) {
				soma += n;
				i++;
			}
			
			if (i == 10) {
				break;
			}
		}
		
		System.out.println("A soma dos números pares digitados é " + soma);
		
		input.close();
	}
}