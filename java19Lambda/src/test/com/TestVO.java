package test.com;

import java.util.Objects;

public class TestVO {
	private int age;
	private String name;
	
	
	public TestVO() {
		// TODO Auto-generated constructor stub
	}


	public TestVO(String name, int age ) {
		super();
		this.age = age;
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "TestVO [age=" + age + ", name=" + name + "] \n" ;
	}


	
	//data class로 취급 
	//data class : 주소가 다른 객체이더라도 속성값이 같으면 같은 객체로 인정.
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestVO other = (TestVO) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
