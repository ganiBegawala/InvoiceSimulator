import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		String option="";
		char temp;
		
		Menu m= new Menu();
		People p=new People();
		
		System.out.println("\t\t\t\t\t\t Welcome to my Personal Management Program");

		do {
		     option = m.mainMenu();
			switch (option) {

			case "1":p.addFaculty();
				break;
			case "2":p.addStudent();
				break;
			case "3":p.printStudent();
				break;
			case "4":p.printFaculty();
				break;
			case "5":p.addStaff();
				break;
			case "6":p.printStaff();
				break;
			case "7":
				System.out.print("Would you like to create the report? (Y/N):");
				temp=((new Scanner(System.in)).next().charAt(0));


				if(temp=='Y'||temp=='y') {
					System.out.println("Report created! \nGoodbye!");
					p.printReport();
				}
				else if(temp=='N'||temp=='n') {
					System.out.println("Good Bye!");
				}
				break;
					
				default: System.out.println("Invalid entry - Please try again");

		  }
		} while(!option.equalsIgnoreCase("7"));
	}	

}
