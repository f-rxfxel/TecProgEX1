package exercicios.periodo1;

public class Ex06 {
	
	public static void main (String[] args) {
		
		float gas = 5.87f, eta = 6.12f;
		
		if (eta / gas * 100 >= 70) {
			
			System.out.print("Abasteça com gasolina.");
		}
		
		else {
			
			System.out.print("Abasteça com etanol.");
			
		}		
	}
}