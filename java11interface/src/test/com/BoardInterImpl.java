package test.com;

public class BoardInterImpl implements BoardInter {

	@Override
	public int update(BoardVO vo) {
		System.out.println("update().....");
		System.out.println("vo");
		return 1;
	}

	@Override
	public BoardVO selectOne(BoardVO vo) {
		// TODO Auto-generated method stub
		
		System.out.println("selectOne().....");
		System.out.println("vo");
		
		BoardVO vo2 = new BoardVO();
		vo2.setNum(22);
		vo2.setTitle("jsp22");
		vo2.setContent("web22");
		vo2.setWriter("tester22");
		vo2.setWdate("2024-01-22");
		
		
		return vo2;
	}

	@Override
	public BoardVO[] searchLlist(BoardVO vo) {
		
		BoardVO[] vos = new BoardVO[2];
		
		BoardVO vo2 = new BoardVO();
		vo2.setNum(22);
		vo2.setTitle("jsp22");
		vo2.setContent("web22");
		vo2.setWriter("tester22");
		vo2.setWdate("2024-01-22");
		vos[0]= vo2;
		
		vo2 = new BoardVO();
		vo2.setNum(11);
		vo2.setTitle("jsp11");
		vo2.setContent("web11");
		vo2.setWriter("tester11");
		vo2.setWdate("2024-01-11");
		vos[1]= vo2;
		
		return vos;
	}

	@Override
	public BoardVO[] searchLlist(String searchKey, String searchWord) {
		
		System.out.println(searchKey);
		System.out.println(searchWord);
		
		if(searchKey.equals("title")) {
			System.out.println("제목으로 검");
		}else if(searchKey.equals("writer")) {
			System.out.println("writer");
		}else {
			System.err.println("content");
		}
		
		BoardVO[] vos = new BoardVO[2];
		
		BoardVO vo2 = new BoardVO();
		vo2.setNum(22);
		vo2.setTitle("jsp22");
		vo2.setContent("web22");
		vo2.setWriter("tester22");
		vo2.setWdate("2024-01-22");
		vos[0]= vo2;
		
		vo2 = new BoardVO();
		vo2.setNum(11);
		vo2.setTitle("jsp11");
		vo2.setContent("web11");
		vo2.setWriter("tester11");
		vo2.setWdate("2024-01-11");
		vos[1]= vo2;
		
		return vos;
	}

}
