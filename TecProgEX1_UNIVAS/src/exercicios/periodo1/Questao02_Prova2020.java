package exercicios.periodo1;

import java.util.Scanner;

public class Questao02_Prova2020 {
	
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int sim = 0;
		int nao = 0;
		int sul = 0;
		int sudeste = 0;
		int centroOeste = 0;
		int norte = 0;
		int nordeste = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("A vacina contra o covid-19 fica pronta em 2021? \n "
								+ "1 - SIM \t 2 - NÃO \n "
								+ "Digite uma opção: ");
			int op1 = input.nextInt();
			
			if (op1 == 1) {
				
				sim++;
				
			} else {
				
				nao++;
			}
			
			System.out.println("Qual região do Brasil você mora? \n "
								+ "1 - SUL \n "
								+ "2 - SUDESTE \n "
								+ "3 - CENTRO-OESTE \n "
								+ "4 - NORTE \n "
								+ "5 - NORDESTE \n Digite uma opção: ");
			int op2 = input.nextInt();
			
			if (op2 == 1) {
				
				sul++;
				
			} else if (op2 == 2) {
				
				sudeste++;
				
			} else if (op2 == 3) {
				
				centroOeste++;
				
			} else if (op2 == 4) {
				
				norte++;
				
			} else {
				
				nordeste++;
			}
		}
		
		System.out.println("Resultados: \n"
							+ sim + " votos SIM \t"
							+ nao + " votos NÃO \n");
		
		System.out.println(sul + " moram no SUL \n"
							+ sudeste + " moram no SUDESTE \n"
							+ centroOeste + " moram no CENTRO-OESTE \n"
							+ norte + " moram no NORTE \n"
							+ nordeste + " moram no NORDESTE \n");		

	}
}