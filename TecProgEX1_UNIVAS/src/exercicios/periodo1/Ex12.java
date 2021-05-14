package exercicios.periodo1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		String nome;
		int nota1, nota2, nota3, nota4, notas;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		nome = input.nextLine();
		
		System.out.println("Digite a 1ª nota: ");
		nota1 = input.nextInt();
		
		System.out.println("Digite a 2ª nota: ");
		nota2 = input.nextInt();
		
		System.out.println("Digite a 3ª nota: ");
		nota3 = input.nextInt();
		
		System.out.println("Digite a 4ª nota: ");
		nota4 = input.nextInt();
		
		notas = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (notas < 40) {
			System.out.println("Aluno " + nome + " reprovado!\n");
		} else if ((notas >= 40) && (notas <= 59)) {
			System.out.println("Aluno " + nome + " em recuperação!\n");
			} else {
				System.out.println("Aluno " + nome + " aprovado!\n");
				}
		
		input.close();
	}
}