package exercicios.periodo1;

public class Ex07 {
	
	public static void main (String[] args) {
		
		int n1 = 53, n2 = 86, n3 = 58, n4 = 81, n5 = 47, i = 0;
		
		if (n1 % 2 == 0) {
			
			i += n1;
		}

		if (n2 % 2 == 0) {
			
			i += n2;
		}

		if (n3 % 2 == 0) {
			
			i += n3;
		}

		if (n4 % 2 == 0) {
			
			i += n4;
		}
		
		if (n5 % 2 == 0) {
			
			i += n5;
		}
		
		System.out.println("A soma das variáveis pares é " + i);
		
	}
}