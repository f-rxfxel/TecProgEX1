package exercicios.periodo1;

public class Ex24 {

	public static void main(String[] args) {
		
		int n = 0;
		
		for (int i = 1; i <= 101; i++) {
			
			if (i % 5 == 0) {
				
				continue;
				
			} else {
				
				n += i;
				
			}
		}
		
		System.out.println("A soma dos n�meros de 1 at� 101 � " + n);
	}
}