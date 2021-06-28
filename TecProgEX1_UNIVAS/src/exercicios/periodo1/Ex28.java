package exercicios.periodo1;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] nSorteados = new int[6];
		int[] nApostados = new int[6];
		
		int acertos = 0;
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um n�mero sorteado para a " + (i + 1) + "� posi��o: ");
			nSorteados[i] = input.nextInt(); 
			
				while (nSorteados[i] < 1 || nSorteados[i] > 60) {
					System.out.println("N�mero inv�lido. Digite um n�mero entre 1 (inclusive) e 60 (inclusive)");
					nSorteados[i] = input.nextInt();
					
				}
			}
		
		System.out.println("\t\t---=---");
		
		for(int i = 0; i < 6; i++) {
			System.out.println("Digite um n�mero apostado para a " + (i + 1) + "� posi��o: ");
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
			System.out.println("N�o foi dessa vez!");
		} else if (acertos <= 3 && acertos != 0) {
			System.out.println("Voc� acertou apenas " + acertos + " n�meros!");
		} else if (acertos == 4) {
			System.out.println("Parab�ns! Voc� acertou 4 n�meros!");
		} else if (acertos == 5) {
			System.out.println("Parab�ns! Voc� acertou 5 n�meros!");
		}  else {
			System.out.println("Parab�ns! Voc� j� pode se aposentar!");
		}
		
	input.close();
	}
}