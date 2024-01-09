package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test01Main_set {

	public static void main(String[] args) {
		//배열의 길이가 정해지지 않은 가변배열
		//여러 타입을배열에 넣을 수 있다. (비권장)
		//타입지정 가능 : <객체타입>권장
		
		//1. List 계열 - 주로 사용 : ArrayList
		// 	특징 : 인덱스존재, 중복된 데이터 허용
		
		//2. Set계열 - 주로 사용 : HashSet
		// 특징 :인덱스 없음, 중복된 데이터 불허 (유니크)
		
		HashSet<Integer> set = new HashSet<Integer>();
//		= Set<Integer> set = new HashSet<Integer>();
		set.add(2000);
		set.add(1000);
		set.add(3000);
		set.add(2000);  //중복이 안됨.
		
		set.remove(3000);
		//set.clear();
		
		System.out.println(set);
		System.out.println(set.size());
		//System.out.println(set.get()); -index x
		for (Integer item :set) {
			System.out.println(item);
		}
		
		
		//3.Map계열 - 주로 사용 :
		//	특징 : 키, 값으로 정의(맵핑), 캐는 중복허용안함. 값은중복허용.
		
		
		
	}

}
