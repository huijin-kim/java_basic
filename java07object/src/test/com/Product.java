package test.com;

public class Product {

	//1.속성
	int num;
	String name;
	int price;
	
	//2.매개변수 없는 생성자
	public Product() {
		System.out.println("Product()...");
	}

	//3.모든 속성을 매개변수로 하는 생성자
	public Product(int num, String name, int price) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
	}

	//4.객체정보확인용 메소드
	@Override
	public String toString() {
		return "Product [num=" + num + ", name=" + name + ", price=" + price + "]";
	}
	
}