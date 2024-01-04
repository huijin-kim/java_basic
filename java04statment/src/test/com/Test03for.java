package test.com;

public class Test03for {

	public static void main(String[] args) {
		
		System.out.println("for");
		
		for(int i =0; i<10; i++) {
			System.out.println(i);
		}
		
		for(int x = 0; x<3; x++) {
			for(int i =0; i<10; i++) {
				System.out.println(i);
			}
			System.out.println();
		}
		System.out.println("=========");
		
		
		//구구단 출력해보세요. (for문 사용)  3분이 걸렸어..?
		//printf를 써야함. println은 여러 매개변수를 제공하지 않는다. 
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		

	}//end main

}//end class
