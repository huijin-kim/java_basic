package test.com;

public class Test02Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("클라스 간의 상속..");
		
		Car02 c = new Car02();
		System.out.println(c.model);
		System.out.println(c.price);
		c.start();
		
		System.out.println("----------");
		
		Bus02 b = new Bus02();
		System.out.println(b.model);
		System.out.println(b.price);
		System.out.println(b.count);
		System.out.println(b.pay);
		b.start();
		b.open();
		
		System.out.println("----------");
		
		Taxi02 t = new Taxi02();
		System.out.println(t.model);
		System.out.println(t.price);
		System.out.println(t.part);
		System.out.println(t.pay);
		t.start();
		t.stop();
		

	}

}
