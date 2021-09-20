// This class gets and sets students gpa and credit hours
public class Student extends Person{

	private double gpa;
	private double credHours;
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public double getCredHours() {
		return credHours;
	}
	public void setCredHours(double credHours) {
		this.credHours = credHours;
	}
	public Student() {
		gpa=0;
		credHours=0;
	}
	public Student(String name, String stuId) {
		super(name, stuId);
	}
	@Override
	public String toString() {
		return name +"\t\t"+ stuId +"\n"+"Credit Hours:"+credHours+" ($236.45/credit hour)"+"\nFees: $52\n";

	}
	
	// This function calculates tuition cost for student depending upon their GPA
	public void printCheck() {
		
		System.out.println("Here is the tuition Invoice for "+ name+":\n");
		System.out.println("-------------------------------------------------------------");
		System.out.println(toString());
		if(gpa>=3.85) {
			System.out.println("\nTotal payment (after discount): $"+(Math.round((credHours*236.45)*(0.75)+52)+"(Rounded)"));
			System.out.println("($"+ (Math.round((credHours*236.45)*0.25))+" discount applied)");
		}
		else if(gpa<3.85) {
			System.out.println("\nTotal payment (after discount): $"+(Math.round(credHours*236.45)+52)+"(Rounded)");
			System.out.println("($0 discount applied)");
		}
		System.out.println("-------------------------------------------------------------");
	}
	
}
