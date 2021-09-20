import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;

public class People {
	Person[] people;
	
	public People(){
		people = new Person[100];
		for (int i = 0; i < 100; i++) {
			people[i] = null;	
	}
}
	File file=new File("report.txt");

	//This function adds the Staff to the array by inheriting from their own class to obtain the correct parameters 
	public void addStaff(){
		int i;
		i=getIndex();
		
		System.out.println("Enter Staff info:");
			people[i]=new Staff();
		
		System.out.print("Name of the staff member: ");
			people[i].setName((new Scanner(System.in)).nextLine());	
		
		boolean staffId;
		do {
			staffId=true;
		try {
		System.out.print("Enter the Id: ");
		people[i].setStuId((new Scanner(System.in)).nextLine());
		
		if(!Character.isLetter(people[i].getStuId().charAt(0)) || !Character.isLetter(people[i].getStuId().charAt(1)) || 
				!Character.isDigit(people[i].getStuId().charAt(2)) || !Character.isDigit(people[i].getStuId().charAt(3)) ||
				!Character.isDigit(people[i].getStuId().charAt(4)) || !Character.isDigit(people[i].getStuId().charAt(5)))
			throw new MyException("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
		}
		
		catch(MyException obj){
			obj.getId();
			staffId=false;
		}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
			staffId=false;
		}
		}
		while(staffId==false);
		
		System.out.print("Department: ");
		((Employee) people[i]).setDepartment((new Scanner(System.in)).nextLine());	
		
		System.out.print("Status, Enter P for Part Time or Enter F for Full Time: ");
		((Staff) people[i]).setStatus((new Scanner(System.in)).next().charAt(0));	
		
		System.out.println("\nStaff member added!");
		
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));

			out.println("Staff Member:");
			out.println("--------------\n");
			out.println("Name: "+ people[i].getName());
			out.println("Id: "+people[i].getStuId());
			out.println("Department: "+ ((Employee)people[i]).getDepartment());
			out.println("Status: "+ ((Staff)people[i]).getStatus()+("\n"));
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println("No file");
		}
		}
	// This fuction checks if a certain staff member exist in the array
	public int searchStaff(){
		int index=0;
		String temp;
		
		System.out.print("Enter the Id of the Staff Member: ");
		temp = (new Scanner(System.in)).nextLine();
		
		for ( index = 0; index<100 ; index++) {
			if ( people[index] != null && people[index] instanceof Staff) {
				if ( temp.equalsIgnoreCase(((Staff) people[index]).getStuId()) == true) {
					return index;
				}
			}
		}
		return -1;
	}
	
	// This fuction acts as a wrapper function and then prints after checking a statement
	public void printStaff() {
		int index= searchStaff();
		
		if(index== -1) {
			System.out.println("No Staff Matched!");
		}
		else {
			people[index].printCheck();
		}

	}
	//This function adds the Faculty members by inheriting from their own class
	public void addFaculty() {
		int i;
		i=getIndex();
		
		System.out.println("Enter Faculty info:");
		people[i]=new Faculty();
		
		System.out.print("Name of the Faculty member: ");
		people[i].setName((new Scanner(System.in)).nextLine());		
		
		boolean facultyId;
		do {
			facultyId=true;
		try {
		System.out.print("Enter the Id: ");
		people[i].setStuId((new Scanner(System.in)).nextLine());
		
		if(!Character.isLetter(people[i].getStuId().charAt(0)) || !Character.isLetter(people[i].getStuId().charAt(1)) || 
				!Character.isDigit(people[i].getStuId().charAt(2)) || !Character.isDigit(people[i].getStuId().charAt(3)) ||
				!Character.isDigit(people[i].getStuId().charAt(4)) || !Character.isDigit(people[i].getStuId().charAt(5)))
			throw new MyException("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
		}
		catch(MyException obj){
			obj.getId();
			facultyId=false;
		}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
			facultyId=false;
		}
		}
		while(facultyId==false);
	
		System.out.print("Enter Department: ");
		((Employee) people[i]).setDepartment((new Scanner(System.in)).nextLine());		
				
			do {
				System.out.print("Enter Rank: ");
				((Faculty) people[i]).setRank((new Scanner(System.in)).nextLine());
		
				if(!((Faculty) people[i]).getRank().toLowerCase().equals("professor")){
				System.out.println(" is Invalid");
				}
			}
				 while(!((Faculty)people[i]).getRank().toLowerCase().equals("professor"));
		System.out.println("\nFaculty member added!");
		
		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));

			out.println("Faculty Member:");
			out.println("----------------\n");
			out.println("Name: "+ people[i].getName());
			out.println("Id: "+people[i].getStuId());
			out.println("Department: "+ ((Employee)people[i]).getDepartment());
			out.println("Rank: "+ ((Faculty)people[i]).getRank()+("\n"));
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println("No file");
		}
		
		}
	// This function searches for a faculty member 
	public int searchFaculty(){
		int index=0;
		String temp;
		
		System.out.print("Enter the Id of the Faculty Member: ");
		temp = (new Scanner(System.in)).nextLine();
		
		for ( index = 0; index<100 ; index++) {
			if ( people[index] != null && people[index] instanceof Faculty) {
				if ( temp.equalsIgnoreCase(((Faculty) people[index]).getStuId()) == true) {
					return index;
				}
			}
		}
		return -1;
	  }
	// This function is a wrapper function for the function above
	public void printFaculty() {
		int index= searchFaculty();
		if(index== -1) {
			System.out.println("No Faculty Matched!");
		}
		else {
			((Faculty)people[index]).printCheck();
		}

	}
	
	//
	public void addStudent() {
		int i;
		i=getIndex();
		
		System.out.println("Enter Student info: ");
		people[i]=new Student();
		
		System.out.print("Name of the Student: ");
		people[i].setName((new Scanner(System.in)).nextLine());		
		
		boolean studentId;
		do {
			studentId=true;
		try {
		System.out.print("Enter the Id: ");
		people[i].setStuId((new Scanner(System.in)).nextLine());
		
		if(!Character.isLetter(people[i].getStuId().charAt(0)) || !Character.isLetter(people[i].getStuId().charAt(1)) || 
				!Character.isDigit(people[i].getStuId().charAt(2)) || !Character.isDigit(people[i].getStuId().charAt(3)) ||
				!Character.isDigit(people[i].getStuId().charAt(4)) || !Character.isDigit(people[i].getStuId().charAt(5)))
			throw new MyException("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
		}
		
		catch(MyException obj){
			obj.getId();
			studentId=false;
		}
		catch(StringIndexOutOfBoundsException a) {
			System.out.println("Invalid ID format. Must be LetterLetterDigitDigitDigitDigit");
			studentId=false;
		}
		}
		while(studentId==false);

	boolean checkGpa;
		do {
			 checkGpa=true;
		
		try {
		System.out.print("Enter GPA: ");
		((Student) people[i]).setGpa((new Scanner(System.in)).nextDouble());		
		}
		catch(InputMismatchException e) {
			System.out.println("You must enter a number....try again \n");
			 checkGpa= false;
		}
		}
	while(checkGpa==false);
			
			boolean checkCred;
			do {
				checkCred=true;
		
				try {
					System.out.print("Enter Credit Hours: ");
					((Student) people[i]).setCredHours((new Scanner(System.in)).nextDouble());	
				}
				catch(InputMismatchException f) {
					System.out.println("You must enter a number....try again");
					checkCred=false;
				}
			}
		while(checkCred==false);
		System.out.println("\nStudent added!");

		try {
			PrintWriter out = new PrintWriter(new FileOutputStream(file, true));

			out.println("Student:");
			out.println("---------\n");
			out.println("Name: "+ people[i].getName());
			out.println("Id: "+people[i].getStuId());
			out.println("GPA: "+ ((Student)people[i]).getGpa());
			out.println("Credit Hours: "+ ((Student)people[i]).getCredHours()+("\n"));
			out.close();
		}
		catch(FileNotFoundException e){
			System.out.println("No file");
		}
	}
	private int getIndex() {
		int index=1;
		
		for(;index<100;index++) {
			if(people[index]==null)
				return index;
		}
		return -1;
		
	}
	public int searchStudent() {
		int index;
		String temp;
		
		System.out.print("Enter the Id of the Student: ");
		temp = (new Scanner(System.in)).nextLine();
		
		for ( index=0; index<100 ; index++) {
			if (people[index] != null && people[index] instanceof Student) {
				if ( temp.equalsIgnoreCase(((Student) people[index]).getStuId()) == true) {
					return index;
				}
			}
		}
			return -1;
	}
	public void printStudent() {
		int index=searchStudent();
		
		if(index==-1) {
			System.out.println("No Student Matched!");
		}
		else {
			people[index].printCheck();
		}
	}
	
	// This function prints the invoice on a .txt file
	public void printReport(){
		String readLine;
		System.out.println("Here is the Report:\n");
		try {
			Scanner s=new Scanner(file);
			while(s.hasNextLine()) {
				readLine=s.nextLine();
				System.out.println(readLine);
			}
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		}
	}
}

