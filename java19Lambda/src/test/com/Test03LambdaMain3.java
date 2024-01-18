package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test03LambdaMain3 {

	public static void main(String[] args) {
		System.out.println("Lambda 3");
		
		//13 collection _list Main sort() 참고. **
		
		List<String> list1 = Arrays.asList("kim", "lee", "han");
		System.out.println(list1);
		
		list1.sort((o1,o2) -> o1.compareTo(o2));
		System.out.println(list1);
		
		
		String[] sus = new String[] {"kim", "lee", "han"};
		Arrays.sort(sus, (o1,o2)-> o1.compareTo(o2));
		System.out.println(Arrays.asList(sus));
		
		
		
		
		
		
		

	}//end main

	

}
