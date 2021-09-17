import java.util.*;

// This class is used to display a menu and ask user for an input
public class Menu {

   public String mainMenu() {
	String option;
			 
	System.out.println("\n Choose one of the options:");
	System.out.println("1- Enter the information of the faculty");
	System.out.println("2- Enter the information of the student");
	System.out.println("3- Print tuition invoice");
	System.out.println("4- Print faculty information");
	System.out.println("5- Enter the information of the staff member");
	System.out.println("6- Print the information of the staff member");
	System.out.println("7- Exit Program ");
	System.out.println("-------------------------------------------------");
	System.out.print("\n\t\tEnter your selection:");

	option=(new Scanner(System.in).nextLine());

   return option.toLowerCase();
			
   }
}
