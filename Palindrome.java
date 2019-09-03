package algorithms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		int num2 = 787;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number to check palindrom");
		int num = sc.nextInt();
//==========================palindrom====================================
		if (num == Util.palindrom(num)) {
			System.out.println("palindrom");
		}
		else
		{
			System.out.println(" Not palindrom");
		}
//==========================anagram======================================	
		Util.anagram(String.valueOf(num).toCharArray(),String.valueOf(num2).toCharArray());
		
	}
}
