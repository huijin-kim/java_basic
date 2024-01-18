package test.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test03LambdaMain4 {

	public static void main(String[] args) {
		System.out.println("Lambda 3");
		
		
		TestVO vo1 = new TestVO("kim",11);
		TestVO vo2 = new TestVO("lee",22);
		TestVO vo3 = new TestVO("han",33);
		
		//object 속성중 이름에 대해서 오름차순으로 정렬이 되도록 하세요(람다식 사용할 것)
		List<TestVO> list1 = Arrays.asList(vo1, vo2, vo3);
		System.out.println(list1);
		
		list1.sort((o1,o2) -> o1.getName().compareTo(o2.getName()) );
		System.out.println(list1);
		
		
		//object 속성중 나이에 대해서 내림차순으로 정렬이 되도록 하세요(람다식 사용할 것)
		list1.sort((o1,o2) -> o2.getAge() - o1.getAge() );
		System.out.println(list1);
		
		//별첨 : 데이터 클래스 
		
		TestVO vo4 = new TestVO("han",22);
		TestVO vo5 = new TestVO("han",22);
		System.out.println(vo4==vo5);  //주소비교 
		System.out.println(vo4.equals(vo5)); //객체비교 
		
		Set<TestVO> set = new HashSet<TestVO>();
		set.add(vo4);
		set.add(vo5);
		System.out.println(set.size());
		
		
		
		
		

	}//end main
}
