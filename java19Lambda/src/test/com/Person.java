package test.com;


//@FunctionalInterface 추상메소드 2개 이상 사용불가. 
@FunctionalInterface
public interface Person {

	public void sleep();
	
	//단, default, static 메소드는 추가 가능하다. 
	
	public default void aaa() {
		
	}
}