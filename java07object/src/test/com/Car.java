package test.com;

public class Car {

	/* private */ String model = "BMW";
	int price = 3000;
	Car(){
		//생성자
		System.out.println("Car()....");
	}
	
	//type or void 영문소문자의 식별자(){} - 메소드
	void start() {
		//method
		System.out.println("start()...");
	}

}
