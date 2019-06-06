import java.util.Scanner;

public class bigBoi {
	
		public static void main(String []args){
			
			Scanner bot = new Scanner(System.in);
			System.out.println("enter a number yo");
			int num = bot.nextInt();
			
			System.out.println("enter another number yo");
			int num2 = bot.nextInt();
			
			if (num==num2){
				System.out.println("theyre equal lol");
				System.out.println("ur num is: " + num);
			}
			else{
				System.out.println("no lol");
			}
		}
}
