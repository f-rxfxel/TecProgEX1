package exercicios.periodo1;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nSorteados = new int[6];
		int[] nApostados = new int[6];
		
		int acertos = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um número sorteado para a " + (i + 1) + "ª posição: ");
			nSorteados[i] = input.nextInt(); 
			
				while (nSorteados[i] < 1 || nSorteados[i] > 60) {
					System.out.println("Número inválido. Digite um número entre 1 (inclusive) e 60 (inclusive)");
					nSorteados[i] = input.nextInt();
					
				}
			}
		
		System.out.println("\t\t---=---");
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um número apostado para a " + (i + 1) + "ª posição: ");
			nApostados[i] = input.nextInt(); 
			}
		
		for(int i = 0; i < 6; i++) {
			 for (int j = 0; j < 6; j++) {
				 if (nSorteados[i] == nApostados[j]) {
					 acertos++;
					 break;
				 	}
				 }
			 }
		System.out.println("\t\t---=---");
		
		if (acertos == 0) {
			System.out.println("Não foi dessa vez!");
		} else if (acertos <= 3 && acertos != 0) {
			System.out.println("Você acertou apenas " + acertos + " números!");
		} else if (acertos == 4) {
			System.out.println("Parabéns! Você acertou 4 números!");
		} else if (acertos == 5) {
			System.out.println("Parabéns! Você acertou 5 números!");
		}  else {
			System.out.println("Parabéns! Você já pode se aposentar!");
		}
		
	input.close();
	}
}