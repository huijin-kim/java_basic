package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test01Main7 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");

		// 제네릭 클래스에 타입제한 - TestList5<T extends Bus>
		TestList5<Bus> list5 = new TestList5<Bus>();
		list5.addType(new Bus());
		System.out.println(list5);
		System.out.println(list5.getType());
		System.out.println(list5.getType().getClass().getName());
		System.out.println("======");
		
		TestList5<BigBus> list6 = new TestList5<BigBus>();
		list6.addType(new BigBus());
		System.out.println(list6);
		System.out.println(list6.getType());
		System.out.println(list6.getType().getClass().getName());
		System.out.println("======");
		
		
		// <G extends Bus>
//		System.out.println(list5.getGet(10000));
//		System.out.println(list5.getGet(33.33));
//		System.out.println(list5.getGet("kim"));
//		System.out.println(list5.getGet(new TestVO()));
//		System.out.println(list5.getGet(new Car()));
		System.out.println(list5.getGet(new Bus()));
		System.out.println(list5.getGet(new BigBus()));

		// static <G extends Bus>
//		System.out.println(TestList5.getStaticGet(10000));
//		System.out.println(TestList5.getStaticGet(33.33));
//		System.out.println(TestList5.getStaticGet("kim"));
//		System.out.println(TestList5.getStaticGet(new TestVO()));
//		System.out.println(TestList5.getStaticGet(new Car()));
		System.out.println(TestList5.getStaticGet(new Bus()));
		System.out.println(TestList5.getStaticGet(new BigBus()));

	}// end main

}// end class