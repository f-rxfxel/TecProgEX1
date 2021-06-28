package exercicios.periodo1;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float vProd = 0.0f, soma = 0.0f;
		
		while (true) {
			
			System.out.println("Digite o valor do produto: \t(-1 para finalizar a soma)");
			vProd = input.nextFloat();
			
			if (vProd == -1) {
				
				break;
				
			} else {
				
				soma += vProd;
				
			}
		}
		
		System.out.println("O valor dos produtos vendidos no dia foi de R$ " + soma);
		
		input.close();
	}
}