package exercicios.periodo1;

public class Ex09 {

	public static void main(String[] args) {

		float c1 = 120.0f, c2 = 550.99f, c3 = 999.80f, c4 = 1520.00f, c5 = 1800.00f, c6 = 2300.50f, saldo = 2000.00f;

		if ((saldo >= 100) && (saldo <= 1000)) {

			System.out.println("Voc� pode comprar um celular na faixa de R$ 100 at� R$ 1000. \nOs apararelhos dispon�veis custam: \nR$ " + c1 + " \nR$ " + c2 + "\nR$ " + c3);

		} else if ((saldo >= 1001) && (saldo <= 2000)) {

			System.out.println("Voc� pode comprar um celular na faixa de R$ 1001 at� R$ 2000. \n Os apararelhos dispon�veis custam: \nR$ " + c4 + "\nR$ " + c5);

		} else {

			System.out.println("Voc� pode comprar um celular acima de R$ 2001. \n Os apararelhos dispon�veis custam: \nR$ " + c6);

		}
	}
}