package exercicios.periodo1;

public class Ex04 {

	public static void main (String[] args) {

		int n1 = 12, n2 = 3;
		int resto = n1 % n2;
		
		if (resto == 0) {
			
			System.out.println("Divisão perfeita!");
			
		} else {
			
			System.out.println("Há sobra na divisão de " + n1 + " por " + n2);
			
		}
	}
}