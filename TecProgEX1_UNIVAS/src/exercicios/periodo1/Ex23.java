package exercicios.periodo1;
import java.util.Scanner;

public class Ex23 {
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String a = "*";

		for (int i = 0; i < 10; i++) {
		
			System.out.println(a);
			a += "*";
			
		}
			
		input.close();
	}
}