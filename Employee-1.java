
public abstract class Employee extends Person{

	public String department;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Employee() {
		super();
		department="";

		// TODO Auto-generated constructor stub
	}

	public Employee(String name, String stuId) {
		super(name, stuId);
		// TODO Auto-generated constructor stub
	}
	
}