import java.util.Scanner;

public class score {

		public static void main(String []args){
			
			Scanner bot = new Scanner(System.in);
			
			System.out.println("This is the indian parents' grading scale\n\nWhat grade did you get on your math test?");
			
			int score = bot.nextInt();
			
			switch (score){
			
			case 100 :
				System.out.println("You could've done better");
				break;
			case 90 :
				System.out.println("I'm not talking to you for 2 days");
				break;
			case 80 : 
				System.out.println("No food for you tonight");
				break;
			case 70 :
				System.out.println("You're not my son anymore");
				break;
			default:
				System.out.println("Round to lowest multiple of ten");
			
			
			}
			
			
			
			
			
		}
			
}
