import java.util.Scanner;

public class whatsMyName {
	
	public static void main(String []args) {
		
		Scanner newScanner = new Scanner(System.in);
		System.out.println("What's your first name?");
		String fName = newScanner.next();
		System.out.println("What's your last name?");
		String lName = newScanner.next();
		System.out.println("Your full name is " + fName + " " + lName);
		
		
		
		
	}

}
