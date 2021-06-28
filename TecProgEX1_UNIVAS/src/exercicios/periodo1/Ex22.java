package exercicios.periodo1;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int vA = 0, vB = 0, nE = 0;

		for(int i = 0; i < 135; i++) {
			
			System.out.println("Quantos foram os gols da Argentina?");
			int gA = input.nextInt();
			
			System.out.println("Quantos foram os gols do Brasil?");
			int gB = input.nextInt();
			
			if(gA > gB) {
				
				vA++;
				
			} else if (gA < gB) {
				
				vB++;
				
			} else {
				
				nE++;
				
			}
			
			System.out.println("Vitórias da Argentina: " + vA + "\nVitórias do Brasil: " + vB + "Empates: " + nE);
			
		}
		
	input.close();
	
	}
}