package test.com;

public class Test01array5 {

	public static void main(String[] args) {
		System.out.println("array....5");
		
		String[][] names = new String[][] {
			{"kim", "lee","han"},
			{"chio", "moon", "yang", "yu"}
		};
		
		System.out.println(names.length);
		System.out.println(names[0].length);
		System.out.println(names[1].length);
		
		
		for(int i =0; i<names[0].length; i++) {
			System.out.print(names[1][i]+ " ");
		}
		System.out.println();
		
		for(int i =0; i<names.length; i++) {
			for(int j =0; j<names[i].length; j++) {
				System.out.print(names[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("==================");
		
		names[1][0] = "aaa";
		names[1][1] = "bbb";
		names[1][2] = "ccc";
		names[1][3] = "ddd";
		
		names[1] = new String[] {"xxx","yyy","zzz","mmm"};
		
		for (int x = 0; x < names.length; x++) {
			for (int i = 0; i < names[x].length; i++) {
				System.out.print(names[x][i] +" ");
			}
			System.out.println();
		}
	}

}
