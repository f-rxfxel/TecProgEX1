package exercicios.periodo1;

public class Ex17 {

	public static void main(String[] args) {
		
		float vMensalidade = 1000.0f;
		int semestres = 7;
		float pAumento = 0.05f;
		
		for (int i = 0; i < semestres; i++) { 
			
			float vAumento = vMensalidade * pAumento;
			vMensalidade += vAumento;
			
		}
		System.out.println("O valor a ser pago é " + vMensalidade);
	}
}