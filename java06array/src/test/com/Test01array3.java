package test.com;

public class Test01array3 {

	public static void main(String[] args) {
		System.out.println("array... 3");
		
		//배열 초기화 방법1
		int[] arr = new int[] {11,22,33};
		String[] strs = new String[] {"java", "js", "html"};
		
		//방법2
		int[] arr2 = new int[5];
		for(int i =0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		String[] strs2 = new String[4];
		for(int i =0; i<strs2.length; i++) {
			System.out.println(strs2[i]);
		}
		
		//주의점 : 정해진 인덱스를 벗어나는 접근은 에러발생함. 
		System.out.println(strs2[4]);
		
	}

}
