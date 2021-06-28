package exercicios.periodo1;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	int[] nums = new int [5];
	int nSubs = 0;
	
		for(int i = 0; i < nums.length; i++) {
			System.out.println("Digite o " + (i + 1) + "° número:");
			nums[i] = input.nextInt();
			
			if(nums[i] < 0) {
				nums[i] = 0;
				nSubs++;
				}
			}
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println("Foram substituídos " + nSubs + " números");
		
		input.close();
	}
}