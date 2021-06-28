package exercicios.periodo1;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float mAno = 0;
		float[] mMes = new float[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite a temperatura m�dia do m�s " + (i + 1) + ":");
			mMes[i] = input.nextFloat();
			mAno += mMes[i];
		}
		
		mAno = mAno / 12;
		
		System.out.println("A m�dia anual foi de " + mAno);
		
		for (int i = 0; i < 12; i++) {
			if(mMes[i] > mAno) {
				System.out.println("O m�s " + i + " foi um m�s com a temperatura acima da m�dia anual, com " + mMes[i] + "�.");
			}
		}
		
		input.close();
	}
}