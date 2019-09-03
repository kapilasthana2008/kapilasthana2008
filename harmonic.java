package BridgeLabzFunctions;

import java.util.Scanner;

/*
 * Harmonic Number 
Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N (http://users.encs.concordia.ca/~chvatal/notes/harmonic.html).
I/P -> The Harmonic Value N. Ensure N != 0
Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
O/P -> Print the Nth Harmonic Value.

 * */

public class harmonic {

	public static void main(String[] args) {

		float harmonic = 0.0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		for (int i = 1; i<=num; i++) {
			
			harmonic += (float)1/i;
		}

		System.out.println(num+"th harmonic number is "+harmonic);
	}
}
