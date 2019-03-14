import java.util.Scanner;

public class yesNo {
	
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yes or No?");
		String one = scan.next();
		String yes = "yes";
		String no = "no";
		
		
		if (one.equalsIgnoreCase(yes))
		{
			System.out.println("of course");
		}
		else if (one.equalsIgnoreCase(no))
		{
			System.out.println("indubitably");
		}
		else
		{
			System.out.println("hhhhhhwwwwwhhhattt?!?!");
		}
		
		
	}

}
