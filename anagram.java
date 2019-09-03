package algorithms;

import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the 1st string");
		String a1 = sc.nextLine();
		System.out.println("enter the 2nd string");
		String a2 = sc.nextLine();
		
		if (a1.length() != a2.length()) {
			System.out.println("length should be equal.");
			return;
		}
		else
		{
			char[] a1ToCharArray = a1.toCharArray();
			char[] a2ToCharArray = a2.toCharArray();	

			String str1 = new String(Util.sort(a1ToCharArray));
			String str2 = new String(Util.sort(a2ToCharArray));
			
			if (str1.equals(str2)) {
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
		
	}	
	
}
