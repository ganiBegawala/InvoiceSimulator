
public class Faculty extends Employee {
	
	private String rank;

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public Faculty() {
		// TODO Auto-generated constructor stub
	}

	public Faculty(String name, String stuId) {
		super(name, stuId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name +"\t\t"+ stuId+"\n\n"+department+" Department, "+rank;
	}

	@Override
	public void printCheck() {
		System.out.println("-------------------------------------------------------------");
		System.out.println(toString());
		System.out.println("-------------------------------------------------------------");

	}
	
	
	}


