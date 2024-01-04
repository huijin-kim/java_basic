package test.com;

public class BoardPro {
	
	Board[] listBoard() {
		Board[] bs = new Board[4];
		
		bs[0] = new Board(1,"title1","content1","writer1","2024-01-01");
		bs[1] = new Board(2,"title2","content2","writer2","2024-01-02");
		bs[2] = new Board(3,"title3","content3","writer3","2024-01-03");
		bs[3] = new Board(4,"title4","content4","writer4","2024-01-04");
		
		
		return bs;
	}

}
