package test.com;

public class Board {

	int num;
	String title;
	String content;
	String writer;
	String wdate;

	public Board() {
		// TODO Auto-generated constructor stub
	}

	public Board(int num, String title, String content, String writer, String wdate) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.wdate = wdate;
	}

	@Override
	public String toString() {
		return "Board [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + ", wdate="
				+ wdate + "]";
	}
}
