package test.com.member;

import java.util.List;

public class Test01MemberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Member...");
		
		MemberDAO dao = new MemberDAOimpl();
		
		//1. insert
		MemberVO m = new MemberVO();
		m.setNum(1);
		m.setId("th1");
		m.setPw("p1");
		m.setName("n1");
		m.setTel("01");
		
		int result = dao.insert(m);
		System.out.println("result: " +result);
		
		
		//2. update
		//위의 코드에서 아래의 updat만 변경해주면 가능. 3.도 동일. 
//		int result = dao.update(m);
		
		
		//4. selectOne
	    m = new MemberVO();
		m.setNum(14);
		m.setId("th4");
		m.setPw("p4");
		m.setName("n4");
		m.setTel("04");
		
		MemberVO vo2 = dao.selectOne(m);
		System.out.println("vo2 : " +vo2);
		
		
		//5. selectAll
		List<MemberVO> vos = dao.selectAll();
		for(MemberVO x : vos) {
			System.out.println(x);
		}
		
		//6. searchList
		vos = dao.SearchList("name", "kim");
		for(MemberVO x : vos) {
			System.out.println(x);
		}
		
	}//end main

}
