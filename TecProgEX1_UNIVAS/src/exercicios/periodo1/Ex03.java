package exercicios.periodo1;

public class Ex03 {
	
	public static void main (String [] args) {
		
		int idade = 18;
		
		if (idade <= 7) {
			
			System.out.println("Infantil A");
			
		} else if ((idade > 7) && (idade <= 10)) {
			
			System.out.println("Infantil B");
			
		} else if ((idade > 10) && (idade <= 13)) {
			
			System.out.println("Juvenil A");
			
		} else if ((idade > 13) && (idade <= 17)) {
			
			System.out.println("Juvenil B");
			
		} else if ((idade > 17) && (idade <= 60)) {
			
			System.out.println("Adulto");
			
		} else {
			
			System.out.println("Sênior");
			
		}
	}
}