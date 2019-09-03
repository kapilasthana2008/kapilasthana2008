package BridgeLabzFunctions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class leapYear {

	public static int count(int num)
	{
		int temp = num;
		int count = 0;
		while(temp != 0)
		{
			count += 1;
			temp = temp/10;
		}
		return count;
	}
	
	static void leapyear(int year) {
		if (count(year)>3)
		{
			if (year%4==0 && year%100!=0 || year%400==0) {
				System.out.println(year+" is leap year");
			}
			else
			{
				System.out.println(year+" is not leap year");
			}
		}
		else
		{
			System.out.println("year should be greater than 1000");
		}
			
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter year");
		
		try {
			int year = sc.nextInt();
			leapyear(year);
		} catch (InputMismatchException e) {
			System.out.println("please enter in decimals");
		}

		
	}
	
}
