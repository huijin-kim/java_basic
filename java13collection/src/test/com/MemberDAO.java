package test.com;

import java.util.List;

public interface MemberDAO {
	
	public List<MemberVO> selectAll(MemberVO vo) ;
	
	public List<MemberVO> selectAll();

}
