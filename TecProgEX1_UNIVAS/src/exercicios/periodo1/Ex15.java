package exercicios.periodo1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite seu peso: ");
		float peso = input.nextFloat();
		
		System.out.println("Digite sua altura: ");
		float altura = input.nextFloat();
		
		float imc = peso / (altura * altura);
		
		if (imc < 18.5f) {
			System.out.println("Abaixo do peso.");
			
		} else if (imc >= 18.5f && imc <= 24.9f) {
			
			System.out.println("Peso normal.");
			
		} else if (imc >= 25 && imc <= 29.9f) {
			
			System.out.println("Sobrepeso.");
			
		} else if (imc >= 30 && imc <= 34.9f) {
			
			System.out.println("Obesidade grau 1.");
			
		} else if (imc >= 35 && imc <= 39.9f) {
			
			System.out.println("Obesidade grau 2.");
			
		} else {
			
			System.out.println("Obesidade grau 3.");
		}

		input.close();
	}
}