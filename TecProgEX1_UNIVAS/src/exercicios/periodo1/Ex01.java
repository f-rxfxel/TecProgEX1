package exercicios.periodo1;

public class Ex01 {

	public static void main (String[] args) {
		
		double salario = 3000;
		
		if (salario <= 1903.98) {
			
			System.out.println("Insento");
			
		} else if ((salario > 1903.98) && (salario <= 2826.66)) {
			
			System.out.println("7,5%");
			
		} else if ((salario > 2826.66) && (salario <= 3751.05)) {
			
			System.out.println("15%");
			
		} else if ((salario > 3751.05) && (salario <= 4664.68)) {
			
			System.out.println("22,5%");
			
		} else {
			
			System.out.println("27,5%");
			
		}
	}
}