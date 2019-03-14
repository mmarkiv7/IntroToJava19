import java.util.Scanner;

public class modulus {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scan.nextInt();
		
		if (number%5 == 0) {
			System.out.println("The dude abides");
		}
		else if (number%5 == 1) {
			System.out.println("The road to success is always under construction");
		}
		else if (number%5 == 2) {
			System.out.println("Has Anyone Really Been Far Even as Decided to Use Even Go Want to do Look More Like?");
		}
		else if (number%5 == 3) {
			System.out.println("I can lick my elbows");
		}
		else if (number%5 == 4) {
			System.out.println("Shrek is love, Shrek is life");
		}
		

	}

}
