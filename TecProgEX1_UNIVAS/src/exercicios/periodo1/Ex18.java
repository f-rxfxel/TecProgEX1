package exercicios.periodo1;

import java.io.IOException;
import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		int soma = 0;

		for(int i = 0; i < 30; i++) {
			
			System.out.println("Digite um n�mero: ");
			int n = input.nextInt();
			
			if ((n % 2 > 0) && (n >= 23) && (n <= 99)) {
				
			soma =+ n;
			
			}
		}
		
		System.out.println("A soma dos n�emros �mpares entre 3 e 99 � " + soma);
		
		input.close();
	}
}