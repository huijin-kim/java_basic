package test.com;

import java.util.Arrays;
import java.util.List;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");
		
		//<타입지정해서 사용> -  사용시에 타입을 특정함.
		//가독성, 명확성이 좋아진다는 장점.
		
		//<> 제네릭 사용하지 않으면 여러타입을 담을 수 있다.
		List arr = Arrays.asList(11,22,33.33, 
				new Integer[] {11,22}, "hello",
				new TestVO());
		System.out.println(arr);
		System.out.println(arr.get(0).getClass());
		System.out.println(arr.get(0).getClass().getName());
		System.out.println(arr.get(2).getClass().getName());
		System.out.println(arr.get(3).getClass().getName());
		System.out.println(arr.get(4).getClass().getName());
		System.out.println(arr.get(5).getClass().getName());
		
		// jdk 5.0부 제네릭 지원.  <>
		//List<E>  Map<K,V>
		//T:Type, E:Element, K:Key, V:Value, N;Number
		//? AnyType == Object
		List<Object> list1 = Arrays.asList(11,22,33.33, 
				new Integer[] {11,22}, "hello",
				new TestVO());
		
		List<?> list2 = Arrays.asList(11,22,33.33, 
				new Integer[] {11,22}, "hello",
				new TestVO());
		
		List<TestVO> list3 = Arrays.asList(new TestVO());
		
		List<String> list4 = Arrays.asList("hello");
		List<Integer> list5 = Arrays.asList(11,22);
		List<Double> list6 = Arrays.asList(33.33);
		List<Number> list7 = Arrays.asList(11,22,33.33);
		

	}//end main

}//end class
