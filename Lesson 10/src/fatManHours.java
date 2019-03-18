import java.util.Scanner;

public class fatManHours {
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your weight on Earth?");
		int earthW = scan.nextInt();
		System.out.println("Choose a planet to preview your weight on");
		System.out.println("1. Voltar");
		System.out.println("2. Krypton");
		System.out.println("3. Fertos");
		System.out.println("4. Servontos");
		System.out.println("\nSelection?");
		int cas = scan.nextInt();
		
		switch(cas) {
		
		case 1: //times 0.091
			System.out.println("your weight on Voltar would be " + (earthW* 0.091));
			break;
			
		case 2: //times 0.720
			System.out.println("your weight on Krypton would be " + (earthW * 0.720));
			break;
			
		case 3: //times 0.865
			System.out.println("your weight on fertos would be " + (earthW * 0.865));
			break;
		case 4: //times 4.612
			System.out.println("your weight on Servontos would be " + (earthW* 4.612));
			break;
		
		}
		
		
		
		
		
	}
	
}
