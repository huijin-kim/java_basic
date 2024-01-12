package test.com.board;

import java.util.ArrayList;
import java.util.List;

import test.com.member.MemberVO;

public class BoardDAOimpl implements BoardDAO {

	@Override
	public int insert(BoardVO vo) {
		System.out.println("inseart");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int update(BoardVO vo) {
		System.out.println("update");
		System.out.println(vo);
		return 0;
	}

	@Override
	public int delete(BoardVO vo) {
		System.out.println("delete");
		System.out.println(vo);
		return 0;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		System.out.println("selectOne");
		System.out.println(vo);
		
		
		BoardVO vo2 = new BoardVO();
		vo2.setNum(11);
		vo2.setId("admin11");
		vo2.setPw("ps11");
		vo2.setName("kim11");
		vo2.setTel("011");
		return vo2;
		
	}

	@Override
	public List<BoardVO> selectAll() {
		System.out.println("selectAll...");
		
		List<BoardVO> vos = new ArrayList<BoardVO>();
		
		for (int i = 0; i < 3; i++) {
			BoardVO vo2 = new BoardVO();
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
	public List<BoardVO> searchList(String key, String word) {
		System.out.println("SearchList...");
		System.out.println(key + ":" + word);
		
		List<BoardVO> vos = new ArrayList<BoardVO>();
		
		for (int i = 0; i < 2; i++) {
			BoardVO vo2 = new BoardVO();
			vo2.setNum(11 +i );
			vo2.setId("admin11"+i);
			vo2.setPw("ps11"+i);
			vo2.setName("kim11"+i);
			vo2.setTel("011"+i);
			vos.add(vo2);
			
		}
		
		return vos;
	}

	@Override
	public int inseart(BoardVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

}






