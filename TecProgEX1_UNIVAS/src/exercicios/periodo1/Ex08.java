package exercicios.periodo1;

import java.util.Scanner;

public class Ex08 {

	public static void main (String [] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
	int alfa = input.nextInt();
	
	System.out.println("Digite outro número: ");
	int beta = input.nextInt();
	
	input.close();
	
	System.out.println("Alfa = " + alfa + "\n" + "Beta = " + beta + "\n");
	
	int gama;
	
	gama = alfa;
	alfa = beta;
	beta = gama;
	
	System.out.println("Alfa = " + alfa + "\n" + "Beta = " + beta);
		
	}
}