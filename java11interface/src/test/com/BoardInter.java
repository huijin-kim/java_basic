package test.com;

public interface BoardInter{
	
	String URL = "http://aaa.com";
	
	
	
	public int update(BoardVO vo);
	
	public BoardVO selectOne(BoardVO vo);
	
	//여러개의 글 정보를 받을려면 어느 타입에 넣어줘야할까요? -> 배열
	public BoardVO[] searchLlist(BoardVO vo);
	public BoardVO[] searchLlist(String searchKey, String searchWord);
	

}
