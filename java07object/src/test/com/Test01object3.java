package test.com;

public class Test01object3 {

	public static void main(String[] args) {
		System.out.println("object...3");

		//객체 = 속성 + 기능 + 객체
		//객체를 정의하기위한 타입이 필요하다>> 클래스
		
		
		Car c = new Car();
		System.out.println(c.model);
		System.out.println(c.price);
		c.start();
		
	}//end main

}
