package exercicios.periodo1;
import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0, par = 0, impar = 0;

		for (int i = 0; i < 20; i ++) {
			
			System.out.println("Digite um n�mero: ");
			n = input.nextInt();
			
			if (n % 2 == 0) {
				
				par++;
				
			} else {
				
				impar++;
				
			}
		}
		
		System.out.println(par + " n�meros pares \n" + impar + " n�meros �mpares");
		
		input.close();
	}
}