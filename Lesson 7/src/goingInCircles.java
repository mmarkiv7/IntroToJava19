import java.util.Scanner;

public class goingInCircles {
	
	public static void main(String []args) {
		
		//area = pi (r^2)
		
	/*	Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your area?");
		double area = scanner.nextDouble();
		
		double radius = (area / Math.PI);
		double finalRadius = Math.sqrt(radius);
		
		System.out.println("Your radius is = " + finalRadius);*/
		
		
		Scanner bot = new Scanner(System.in);
		System.out.println("Please enter your name");
		String name = bot.nextLine();
		
		System.out.println("How many characters would you like to print");
		int character = bot.nextInt();
		
		System.out.println(name.substring(0, character));
		
		
	}

}
