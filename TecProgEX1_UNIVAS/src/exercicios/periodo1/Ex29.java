package exercicios.periodo1;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		float mAno = 0;
		float[] mMes = new float[12];
		
		for (int i = 0; i < 12; i++) {
			System.out.println("Digite a temperatura média do mês " + (i + 1) + ":");
			mMes[i] = input.nextFloat();
			mAno += mMes[i];
		}
		
		mAno = mAno / 12;
		
		System.out.println("A média anual foi de " + mAno);
		
		for (int i = 0; i < 12; i++) {
			if(mMes[i] > mAno) {
				System.out.println("O mês " + i + " foi um mês com a temperatura acima da média anual, com " + mMes[i] + "°.");
			}
		}
		
		input.close();
	}
}