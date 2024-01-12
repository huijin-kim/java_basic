package test.com.member;

import java.util.ArrayList;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public int insert(MemberVO vo) {
		// TODO Auto-generated method stub
		System.out.println("insert...");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int update(MemberVO vo) {
		// TODO Auto-generated method stub
		System.out.println("update");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int delete(MemberVO vo) {
		System.out.println("delete...");
		System.out.println(vo);
		return 0;
	}

	@Override
	public MemberVO selectOne(MemberVO vo) {
		// TODO Auto-generated method stub
		System.out.println("selectOne...");
		System.out.println(vo);
		
		MemberVO vo2 = new MemberVO();
		vo2.setNum(11);
		vo2.setId("admin11");
		vo2.setPw("ps11");
		vo2.setName("kim11");
		vo2.setTel("011");
		return vo2;
	}

	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		System.out.println("selectAll...");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		
		for (int i = 0; i < 2; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(11);
			vo2.setId("admin11");
			vo2.setPw("ps11");
			vo2.setName("kim11");
			vo2.setTel("011");
			vos.add(vo2);
			
		}
		
		return vos;
	}

	@Override
	public List<MemberVO> SearchList(String key, String Word) {
		// TODO Auto-generated method stub
		System.out.println("SearchList...");
		System.out.println(key + ":" + Word);
		
	List<MemberVO> vos = new ArrayList<MemberVO>();
		
		for (int i = 0; i < 2; i++) {
			MemberVO vo2 = new MemberVO();
			vo2.setNum(11 +i );
			vo2.setId("admin11"+i);
			vo2.setPw("ps11"+i);
			vo2.setName("kim11"+i);
			vo2.setTel("011"+i);
			vos.add(vo2);
			
		}
		
		return vos;

		
	}

}
