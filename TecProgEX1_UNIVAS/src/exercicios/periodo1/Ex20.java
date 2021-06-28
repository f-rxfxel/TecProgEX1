package exercicios.periodo1;

public class Ex20 {

	public static void main(String[] args) {

		int pares = 0;
		
		for (int i = 2; i < 101; i += 2) {

			pares = i + pares;
			
		}
		
		System.out.println(pares);
	}
}