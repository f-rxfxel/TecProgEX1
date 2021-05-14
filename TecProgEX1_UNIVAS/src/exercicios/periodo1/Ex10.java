package exercicios.periodo1;

import java.util.Scanner;

public class Ex10 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		float altura, peso;
		int HM;
		
		System.out.println("Digite 1 para HOMEM e 0 MULHER: ");
		HM = input.nextInt();
		
		System.out.println("Digite a sua altura:");
		altura = input.nextFloat();
		
		input.close();
		
		if (HM == 1) {
			
			peso = 72.7f * altura - 58;
			
		} else {
			
			peso = 62.1f * altura - 44.7f;
			
		}
		
		System.out.printf("O seu peso ideal é " +  peso);
		
	}
}