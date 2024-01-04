package test.com;

public class Test01array {

	public static void main(String[] args) {
		System.out.println("array...");
		
		int a = 11;
		int b = 22;
		int c = 33;
		
		int[] arr = new int[]{11,22,33};
		arr = new int[]{44,55,66,88};
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println();
		
		arr[0] = 99;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		
	}//end main

}//end class
