package exercicios.periodo1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		String nome;
		int nota1, nota2, nota3, nota4, notas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome = input.nextLine();
		
		System.out.println("Digite a 1� nota: ");
		nota1 = input.nextInt();
		
		System.out.println("Digite a 2� nota: ");
		nota2 = input.nextInt();
		
		System.out.println("Digite a 3� nota: ");
		nota3 = input.nextInt();
		
		System.out.println("Digite a 4� nota: ");
		nota4 = input.nextInt();
		
		notas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notas < 40) {
			System.out.println("Aluno " + nome + " reprovado!\n");
		} else if ((notas >= 40) && (notas <= 59)) {
			System.out.println("Aluno " + nome + " em recupera��o!\n");
			} else {
				System.out.println("Aluno " + nome + " aprovado!\n");
				}
		
		input.close();
	}
}