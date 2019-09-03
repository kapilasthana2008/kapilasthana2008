package BridgeLabzFunctions;

import java.util.Scanner;

/*
 * 
 * Desc -> Computes the prime factorization of N using brute force.
I/P -> Number to find the prime factors
Logic -> Traverse till i*i <= N instead of i <= N for efficiency.
O/P -> Print the prime factors of number N.

 * */

public class primeFactors {

	static boolean isPrime(int num)
	{
		 for (int i = 2; i < num; i++) 
	            if (num % i == 0) 
	                return false; 
		return true;
	}
	
	static void prime(int num)
	{
		int temp = num;
		
		for (int i = 2; i*i <= num;i++) {
			
			if (temp %i == 0) {
				
				temp = temp/i;
					
					if (isPrime(i)) {
				
						System.out.println(i);
					}
			} 

		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = sc.nextInt();
		prime(num);
		
	}
}
