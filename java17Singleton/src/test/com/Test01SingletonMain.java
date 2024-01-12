package test.com;

public class Test01SingletonMain {
	

	public static void main(String[] args) {
		System.out.println("싱글톤 디자인패턴 Singleton");
		
		//클래스에서 만들수 있는 인스턴스가 오직 하나일 경우
		//이 객체에 접근은 어디서든지 하나로만 통일하여 제공하겠다는 의도로 객체생성
		
		//특정 시스템에 많은 프린트기능이 있다라도 프린터스풀은 하나이어야 함
		
		PrintSpool ps1 = PrintSpool.getInstance();
		System.out.println(ps1);
//		ps1.print("hello");
		
		PrintSpool ps2 = PrintSpool.getInstance();
		System.out.println(ps2);
//		ps2.print("hello2");
		
		
	}//end main
	
	

}//end class
