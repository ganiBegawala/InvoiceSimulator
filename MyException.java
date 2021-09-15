
public class MyException extends Exception {

	private String Id;

	public MyException(String id) {
		this.Id = id;
	}
	public void getId() {
		System.out.println(Id);
	}
	
}
