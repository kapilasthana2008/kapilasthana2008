package BridgeLabzFunctions;

import java.util.Scanner;

/*
 * User Input and Replace String Template “Hello <<UserName>>, How are you?” 

I/P -> Take User Name as Input. Ensure UserName has min 3 char
Logic -> Replace <<UserName>> with the proper name
O/P -> Print the String with User Name 

 * */

public class userName {

	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String name = sc.nextLine();
		System.out.println("hello "+name+" ,How are you?");
		System.out.println("now please enter name for replacing username.");
		String replace = sc.nextLine();
		
		if (replace.length()<3) {
			System.out.println("userName should be minimum 3 letters or more.");
			System.exit(0);
		}
		else {
			name = replace;
			System.out.println("hello "+name+" ,How are you?");
		}
	}
}
