import java.util.Scanner;

public class fiveNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first string");
		String string1 = scan.next();
		System.out.println("enter second string");
		String string2 = scan.next();
		
		if (string1.equals(string2))
		{
			System.out.println("Equal - case sensitive");
		}
		
		else if (string1.equalsIgnoreCase(string2)) {
			
			System.out.println("Equal - not case sensitive");
			
		}
		

	}

}
