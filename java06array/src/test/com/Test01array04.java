package test.com;

public class Test01array04 {

	public static void main(String[] args) {
		System.out.println("array....4");

		//{11,22,33},
		//{44,55,66}
		
		//1차원배열
		int[] arr1 = new int[] {11,22,33};
		int[] arr2 = new int[] {44,55,66};
		
		//2차원배열
		int[][] arrs1 = new int[][] {{11,22,33},{44,55,66}};
		int[][] arrs2 = new int[2][3];			//{{0,0,0},{0,0,0}}
		int[][] arrs3 = new int[2][];			//{null,null}
		int[][] arrs4 = new int[][] { new int[] {11,22,33},new int[] {44,55,66}};
		int[][] arrs5 = new int[][] { arr1,arr2};
		
//		for (int i = 0; i < arrs5[0].length; i++) {
//			System.out.print(arrs5[0][i]+" ");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < arrs5[1].length; i++) {
//			System.out.print(arrs5[1][i]+" ");
//		}
//		System.out.println();
		
		for (int x = 0; x < arrs5.length; x++) {
			for (int i = 0; i < arrs5[x].length; i++) {
				System.out.print(arrs5[x][i]+" ");
			}
			System.out.println();
		}

	}

}
