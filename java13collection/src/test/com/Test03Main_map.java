package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Test03Main_map {

	public static void main(String[] args) {
		//배열의 길이가 정해지지 않은 가변배열
		//여러 타입을배열에 넣을 수 있다. (비권장)
		//타입지정 가능 : <객체타입>권장
		
		//1. List 계열 - 주로 사용 : ArrayList
		// 	특징 : 인덱스존재, 중복된 데이터 허용
		
		//2. Set계열 - 주로 사용 : HashSet
		// 특징 :인덱스 없음, 중복된 데이터 불허 (유니크)
		
		//3.Map계열 - 주로 사용 :
		//	특징 : 키, 값으로 정의(맵핑), 캐는 중복허용안함. 값은중복허용.
		
		HashMap<String, Integer> map = 
				new HashMap<String, Integer>();
		
		map.put("kor", 99);
		map.put("kor", 88);
		map.put("eng", 77);
		
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.get("eng"));
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		for (String key : map.keySet()) {
			System.out.println(map.get(key));
			
		}
		
		
	}

}
