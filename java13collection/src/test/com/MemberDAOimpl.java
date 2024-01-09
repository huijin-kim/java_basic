package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemberDAOimpl implements MemberDAO {

	@Override
	public List<MemberVO> selectAll(MemberVO vo) {
		System.out.println("selectAll(MemberVO vo");
		System.out.println(vo);
		
		List<MemberVO> vos = new ArrayList<MemberVO>() ;
		
		
		for (int i = 0; i < 3; i++) {
			MemberVO mvo = new MemberVO() ;
			mvo.setNum (1 +i );
			mvo.setId ("admin"+i );
			mvo.setPw ("'hil11"+i );
			mvo. setName ("kim"+i );
			mvo.setTel ("011"+i );
			vos.add(mvo);
			
		}
		
		return vos;
	}

	@Override
	public List<MemberVO> selectAll() {
		System.out.println("selectAll () ...");
		List<MemberVO> vos = new ArrayList<MemberVO>() ;
		return vos;
	}
	
	
	
	
	

}
