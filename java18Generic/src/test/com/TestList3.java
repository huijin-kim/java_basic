package test.com;

public class TestList3<T> {
	
	private T type;

	public void addType(T type) {
		// TODO Auto-generated method stub
		this.type = type;
		
	}

	public T getType() {
		// TODO Auto-generated method stub
		return type;
	}

	public <G> G getGet(G g) {
		// TODO Auto-generated method stub
		return g;
	}

	public static <G> G getStaticGet(G g) {
		// TODO Auto-generated method stub
		return g;
	}

}
