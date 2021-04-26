package exercicios.periodo1;

public class Ex08 {

	public static void main (String [] args) {
		
	int alfa = 20, beta = 40;
	
	System.out.println("Alfa = " + alfa + "\n" + "Beta = " + beta + "\n");
	
	alfa = beta;
	beta = alfa;
	
	System.out.println("Alfa = " + alfa + "\n" + "Beta = " + beta);
		
	}
}