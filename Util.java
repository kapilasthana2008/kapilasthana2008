package algorithms;

public class Util {

	//======================char[] sorting function================================
	public static char[] sort(char[] arr)
	{
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[i]<arr[j]) {
					char temp = ' ';
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		return arr;
	}
	
	//=====================Prime number============================================
	
	
	public static void checkPrime(int num)
	{
	
		for (int i = 0; i <= num; i++) {
			
			
		}
	}
	
	//=====================finding palindrom============================================
	
	public static int palindrom(int num)
	{
		int reverseNum = 0;
		while (num > 0) {

			reverseNum = reverseNum*10 + num%10;
			num = num/10;	
		}
		return reverseNum;
	}
	//===================anagram=========================================================
	public static void anagram(char[] arr1,char[] arr2)
	{
		char[] a1 = sort(arr1);
		char[] a2 = sort(arr2);
		 
		int num1 = Integer.parseInt(String.valueOf(a1));
		int num2 = Integer.parseInt(String.valueOf(a2));
		
		if (num1 == num2) {
			
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}



