package test.com;

public class Test02interface {

	public static void main(String[] args) {
		System.out.println("interface...");

		
		//2. 인터페이스간의 상속 = 다중상속 가능, extends
			//1. 인터페이스란?
				// 다중상속을 지원하는 툴. 
				// 모든 자원은 public static final
				//추상 메소드를 가질 수 있다. 
		
		
		
		//3. 클래스와 인터페이스간의 상속 = 다중상속가능, 클래스만 인터페이스 상속받기 가능. 
		
		
		//인터페이스 단독으로는 객체 생성 불가. 
		//따라서 상속 관계의 클래스를 이용하여 객체 생성 > 다형성 
		
		Person p = new PersonImpl();
		p.insert();
		
		
		Person p2 = new Person() {
			
			@Override
			public int insert() {
				System.out.println("Anonymous insert()..");
				return 0;
			}
		};
		p2.insert();
		
		
		Person2 pp2 = new Person2impl();
		
		Person2 pp3 = new Person2() {
			
			@Override
			public int insert22() {
				// TODO Auto-generated method stub
				System.out.println("Anoymous insert22(),,,");
				return 0;
			}
		};
		
		pp3.insert22();
		
		
	}//end main

}//end class
