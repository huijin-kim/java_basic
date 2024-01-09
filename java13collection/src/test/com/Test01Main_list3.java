package test.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test01Main_list3 {

	public static void main(String[] args) {

		//2. Set계열 - 주로 사용 : HashSet
		// 특징 :인덱스 없음, 중복된 데이터 불허 (유니크)
		
		//로또 번호 생성기 
		//1~45번까지 정수들 중 랜덤한 6개의 정수를 뽑아냄.
		//뽑힌 6개의 정수는 중복허용하지 않는다. 
		//오름차순 정렬로 출력. 
		
		
//		Set<Integer> lottoNumbers = new HashSet<>(); 
//		//Set은 중복을 허용하지 않기 때문에 중복 체크 자동.
//		
//		Random random = new Random();
//		
//		//사이즈 체크 해줘야함. 그냥 6번 반복이 아닌.
//		while (lottoNumbers.size() < 6) {
//		    // 1부터 45까지의 랜덤한 정수 생성.
//			int randomNumber = random.nextInt(45) + 1;
//		
//			// 숫자 추가. 
//			lottoNumbers.add(randomNumber);
//		}
//		
//		//오름차순 정렬을 위해서 List 이용.
//		List<Integer> sortedLottoNumbers = new LinkedList<>(lottoNumbers);
//		//ArrayList<Integer>  n = new ArrayList<Integer>(lottoNumbers);
//		
//		Collections.sort(sortedLottoNumbers);
//		System.out.println("로또 번호 : " + sortedLottoNumbers);
		
		
		
		//-- 정답 
		
		Random random = new Random();
		Set<Integer> lottonum = new HashSet<Integer>();
		
		while(lottonum.size() <6) {
			lottonum.add(random.nextInt(45)+1);
		}
		
		
		//정렬 1번 방식 
		Object[] arr = lottonum.toArray();
		Arrays.sort(arr);
		System.out.println(Arrays.asList(arr));
		
		//정렬 2번 방식.. 
		List<Integer> list = new ArrayList<Integer>(lottonum);
//		Collections.sort(list);
//		Collections.sort(list, Collections.reverseOrder());
		Collections.sort(list, new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2 - o1; //역정렬.
			}
			
		});
		System.out.println(list);

		
		
	}
}
