package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01Main_list1 {

	public static void main(String[] args) {
		//배열의 길이가 정해지지 않은 가변배열
		//여러 타입을배열에 넣을 수 있다. (비권장)
		//타입지정 가능 : <객체타입>권장
		
		//1. List 계열 - 주로 사용 : ArrayList
		// 	특징 : 인덱스존재, 중복된 데이터 허용
		ArrayList list = new ArrayList();// 비권장
		list.add(1000);
		list.add("kim");
		System.out.println(list);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); // 권
		list2.add(2000);
		list2.add(3000);
		list2.add(4000);
		//list2.add("kim"); // compile err
		
		System.out.println(list2);
		System.out.println(list2.get(0));
		
		
		list2.set(1, 333);  //값 수정
		list2.remove(2);
		
		
		System.out.println(list2);
		System.out.println(list2.size());
		System.out.println(list2.get(0));
		
		list2.clear();
		System.out.println(list2);
		
		//사이즈 고정으로 데이터 추가, 삭제 불가 
//		List<Integer> list3 = Arrays.asList(11,22,33);
		List<Integer> list3 = Arrays.asList(new Integer[] {11,22,33});
		
		list3.add(44);
		System.out.println(list3);
		
		
		//2. Set계열 - 주로 사용 : HashSet
		// 특징 :인덱스 없음, 중복된 데이터 불허 (유니크)
		
		//3.Map계열 - 주로 사용 :
		//	특징 : 키, 값으로 정의(맵핑), 캐는 중복허용안함. 값은중복허용.
		
		
		
	}

}
