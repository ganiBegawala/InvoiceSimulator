
public class Staff extends Employee{
	private char status;
	
	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public Staff(char status) {
		super();
		this.status = status;
	}

	public Staff() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return name +"\t\t"+ stuId+"\n\n"+department+" Department,\t";
	}

	public void printCheck() {
		System.out.println("-------------------------------------------------------------");
		System.out.print(toString());
		if(status=='p'||status=='P') {
			System.out.println("Part Time");
		}
		else if(status=='f'||status=='F') {
			System.out.println("Full Time");
		}
		System.out.println("-------------------------------------------------------------");
	}
}
	

	