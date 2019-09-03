package BridgeLabzFunctions;

import java.util.Scanner;

public class flipCoin {

	
	public static void main(String[] args) {
	
		double heads= 0;
		double tails= 0;
		
		System.out.println("enter the no to flip.");
		Scanner sc = new Scanner(System.in);
		int coin = sc.nextInt();
		
		for (int i = 1; i <= coin; i++) {
			
			if (Math.random() < 0.5) {
			
				tails += 1;
			}
			else
			{
				heads += 1;
			}
		}
		
		System.out.println("tails "+(double)(tails/100)+" heads "+(double)(heads/100));
	}
	
}
