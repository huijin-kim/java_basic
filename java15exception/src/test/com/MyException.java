package test.com;

public class MyException extends Exception {
	
	int age;
	public MyException() {
		// TODO Auto-generated constructor stub
	}
	public MyException(int age) {
		super();
		this.age = age;
	}
	@Override
	public String toString() {
		return "MyException [age=" + age + "]";
	}
	

}
