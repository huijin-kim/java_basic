package test.com;

public class Test01array6 {

	public static void main(String[] args) {
		System.out.println("array....6");

		int[] arr = new int[10];//0이 10개
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
		for (int item : arr) {
			System.out.print(item +" ");
		}
		System.out.println();
		
		int[][] arrs = new int[3][5];
		
		for (int x = 0; x < arrs.length; x++) {
			for (int i = 0; i < arrs[x].length; i++) {
				System.out.print(arrs[x][i] +" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		//foreach문으로 출력해보세요.
		
		for (int[] is : arrs) {
			for (int item : is) {
				System.out.print(item +" ");
			}
			System.out.println();
		}
		System.out.println("==============");
		
		String[][] strss = new String[3][5];
		//foreach문으로 출력해보세요.
		
		for (String[] strs : strss) {
			for (String str : strs) {
				System.out.print(str +" ");
			}
			System.out.println();
		}
		System.out.println("==============");
	}//end main

}//end class
