import java.util.Scanner;

public class goingInCircles {
	
	public static void main(String []args) {
		
		//area = pi (r^2)
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your area?");
		double area = scanner.nextDouble();
		
		double radius = (area / Math.PI);
		double finalRadius = Math.sqrt(radius);
		
		System.out.println("Your radius is = " + finalRadius);
		
		
		
		
		
		
	}

}
