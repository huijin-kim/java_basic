package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01Main5 {

	public static void main(String[] args) {
		System.out.println("Generic...제네릭");
		
		TestList3<Integer> list1 = new TestList3<Integer>();
		list1.addType(10000);
		
		
		System.out.println(list1.getGet(10000));
		System.out.println(list1.getGet("kim"));
		System.out.println(list1.getGet(new TestVO()));
		System.out.println(list1.getGet(new Car()));
		System.out.println(list1.getGet(new Bus()));
		System.out.println(list1.getGet(new Taxi()));
		
		//static Generic method
		System.out.println(TestList3.getStaticGet(10000));
		System.out.println(TestList3.getStaticGet("kim"));
		System.out.println(TestList3.getStaticGet(new TestVO()));
		System.out.println(TestList3.getStaticGet(new Car()));
		System.out.println(TestList3.getStaticGet(new Bus()));
		System.out.println(TestList3.getStaticGet(new Taxi()));
		
	}//end main

}//end class
