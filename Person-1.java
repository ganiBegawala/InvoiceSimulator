
public abstract class Person {
	 
	public String name;
	public String stuId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuId() {
		return stuId;
	}
	public void setStuId(String stuId) {
		this.stuId = stuId;
	}
	public Person(String name, String stuId) {
		this.name = name;
		this.stuId = stuId;
	}
	public Person(){
		name="";
		stuId="";
		}
	@Override
	public String toString() {
		return "Person [name=" + name + ", stuId=" + stuId + "]";
}
	public abstract void printCheck();
	
}