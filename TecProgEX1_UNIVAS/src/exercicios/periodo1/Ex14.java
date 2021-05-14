package exercicios.periodo1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		String nome;
		int carga;
		float valor;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do funcionário: ");
		nome = input.nextLine();
		
		System.out.println("Digite o valor da carga horária: ");
		valor = input.nextFloat();
		
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		carga = input.nextInt();
		
		System.out.println("O funcionário " + nome + " deve receber " + carga * valor);
		
		input.close();
	}
}