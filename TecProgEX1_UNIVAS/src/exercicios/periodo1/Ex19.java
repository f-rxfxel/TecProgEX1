package exercicios.periodo1;

import java.io.IOException;
import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		int maria = 0;
		int joao = 0;
		int jose = 0;

		for (int i = 0; i < 50; i++) {
			
			System.out.println("Qual o seu voto? \n 1 - Maria \t 2 - Jo�o \t 3 - Jos�");
			int voto = input.nextInt();
			
			if (voto == 1) {
				
				maria++;
				
			} else if (voto == 2) {
				
				joao++;
				
			} else {
				
				jose++;
				
			}
		}
		
		if (maria > joao && maria > jose) {
			
			System.out.println("O novo representante � Maria.");
			
		} else if (joao > maria && joao > jose) {
			
			System.out.println("O novo representante � Jo�o.");		
			
		} else {
			
			System.out.println("O novo representante � Jos�.");
			
		}
		
		input.close();
	}
}