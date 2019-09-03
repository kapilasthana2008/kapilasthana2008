package BridgeLabzFunctions;

public class power_of_2 {

	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		int table = 1;
		for (int i = 1; i <=num; i++) {
			table*= 2;
			System.out.println(table);
		}
	}
}
