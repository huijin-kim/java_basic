package test.com;

public class Father extends GrandFather {
	
	String name = "이립";
	int age = 77;
	String car_name = "bmw";
	
	public Father() {
		System.out.println("Father");
	}
	
	//메소드의 재정의 _ super와 똑같은 이름. overwriting
	void sleep() {
		System.out.println("sleep()**....");
	}
	
	void work() {
		System.out.println("work()....");
		System.out.println("this.name: " +this.name);
		System.out.println("super.name : " + super.name );
		this.sleep();
		super.sleep();
	}
	

}
