package test.com;

public class MemberAbsEX extends MemberAbs{
	
	public int insert(Member m) {
		System.out.println("insert()...");
		System.out.println(m);
		return 0;
	}

}
