package BridgeLabzFunctions;

public class triplets {

public static void main(String[] args) {
	int[] arr = {1,1,-2,2,-3,1};
	int countTriplet = 0;
	
	
	for (int i = 0; i < arr.length; i++) {
		
		for (int j = i+1; j < arr.length; j++) {
		
			for (int k = j+1; k < arr.length; k++) {
				
				if (arr[i]+arr[j]+arr[k] == 0) {
					countTriplet += 1;
					System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
				}
			}
		}
	}
	
	System.out.println("total number of tripltets: "+countTriplet);
}
}
