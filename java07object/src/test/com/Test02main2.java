package test.com;

public class Test02main2 {

	public static void main(String[] args) {
		System.out.println("constructor....2");

		Product p = new Product();
		System.out.println(p);
		
		
		Product p2 = new Product(11,"Phone",3000);
		System.out.println(p2);
		
		int a = 10;
		int a2 = 20;
		int[] arr = new int[] {a,a2};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//제품배열을 만들어보세요
		//출력도하세요
		Product[] ps = new Product[] {p,p2};
		for (int i = 0; i < ps.length; i++) {
			System.out.println(ps[i]);
		}

	}

}
