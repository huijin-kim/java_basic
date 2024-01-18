package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main8 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		// 제네릭 클래스에 타입제한 - TestList6<T extends Car>
		//<? super Bus> Bus와 슈퍼가Bus인 타입으로 제한
//		TestList6<? super Bus> list2 = new TestList6<Car>();
		TestList6<? super Bus> list2 = new TestList6<Bus>();
		list2.addType(new Bus());
		list2.addType(new BigBus());
		
		//<? super BigBus> BigBus와 슈퍼가BigBus인 타입으로 제한
//		TestList6<? super BigBus> list3 = new TestList6<Car>();
//		TestList6<? super BigBus> list3 = new TestList6<Bus>();
		TestList6<? super BigBus> list3 = new TestList6<BigBus>();
//		list3.addType(new Bus());
		list3.addType(new BigBus());
		
		TestList6<Car> list4 = new TestList6<Car>();
		list4.addType(new Car());
		System.out.println(list4);
		System.out.println(list4.getType());
		System.out.println(list4.getType().getClass().getName());
		System.out.println("======");
		
		TestList6<Bus> list5 = new TestList6<Bus>();
		list5.addType(new Bus());
		System.out.println(list5);
		System.out.println(list5.getType());
		System.out.println(list5.getType().getClass().getName());
		System.out.println("======");
		
		TestList6<BigBus> list6 = new TestList6<BigBus>();
		list6.addType(new BigBus());
		System.out.println(list6);
		System.out.println(list6.getType());
		System.out.println(list6.getType().getClass().getName());
		System.out.println("======");
		
		//활용 예제
		test(list2);
		
		

	}// end main

	private static void test(TestList6<? super Bus> list2) {
		list2.addType(new Bus());
		list2.addType(new BigBus());
		
	}

}// end class