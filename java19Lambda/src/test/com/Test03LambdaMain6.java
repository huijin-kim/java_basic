package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03LambdaMain6 {

	public static void main(String[] args) {
		System.out.println("Lambda");
		
		TestVO vo1 = new TestVO("Kim",11);
		TestVO vo2 = new TestVO("lee",33);
		TestVO vo3 = new TestVO("han",22);
		
		List<TestVO> list1 = Arrays.asList(vo1,vo2,vo3);
		System.out.println(list1);
		
		list1.sort(Comparator.comparing((vo)->vo.getName()));
		System.out.println(list1);
		
		list1.sort(Comparator.comparing((vo)->vo.getAge()));
		System.out.println(list1);
	
	
	}// end main

}// end class