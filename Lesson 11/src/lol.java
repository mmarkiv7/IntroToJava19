import java.util.Scanner;

public class lol {
	
	public static void main(String []args){
		
	Scanner bot = new Scanner(System.in);
	
	System.out.println("Enter first grade then press enter, then 2nd grade and so on");
	
	String g1 = bot.nextLine();
	String g2 = bot.nextLine();
	String g3 = bot.nextLine();
	String g4 = bot.nextLine();
	String g5 = bot.nextLine();
	String g6 = bot.nextLine();
	String g7 = bot.nextLine();
	String g8 = bot.nextLine();
	
	int gr1 = 0;
	int gr2 = 0;
	int gr3 = 0;
	int gr4 = 0;
	int gr5 = 0;
	int gr6 = 0;
	int gr7 = 0;
	int gr8 = 0;
	
	if (g1.equalsIgnoreCase("A") || g1.equalsIgnoreCase("A-") || g1.equalsIgnoreCase("A+")){gr1 = 4;}
	else if (g1.equalsIgnoreCase("B") || g1.equalsIgnoreCase("B-") || g1.equalsIgnoreCase("B+")){gr1 = 3;} 
	else if (g1.equalsIgnoreCase("C") || g1.equalsIgnoreCase("C-") || g1.equalsIgnoreCase("C+")){gr1 = 2;} 
	else if (g1.equalsIgnoreCase("F")){gr1 = 0;}
	
	else if (g2.equalsIgnoreCase("A") || g2.equalsIgnoreCase("A-") || g2.equalsIgnoreCase("A+")){gr2 = 4;}
	else if (g2.equalsIgnoreCase("B") || g2.equalsIgnoreCase("B-") || g2.equalsIgnoreCase("B+")){gr2 = 3;} 
	else if (g2.equalsIgnoreCase("C") || g2.equalsIgnoreCase("C-") || g2.equalsIgnoreCase("C+")){gr2 = 2;} 
	else if (g2.equalsIgnoreCase("F")){gr2 = 0;}

	if (g3.equalsIgnoreCase("A") || g3.equalsIgnoreCase("A-") || g3.equalsIgnoreCase("A+")){gr3 = 4;}
	else if (g3.equalsIgnoreCase("B") || g3.equalsIgnoreCase("B-") || g3.equalsIgnoreCase("B+")){gr3 = 3;} 
	else if (g3.equalsIgnoreCase("C") || g3.equalsIgnoreCase("C-") || g3.equalsIgnoreCase("C+")){gr3 = 2;} 
	else if (g3.equalsIgnoreCase("F")){gr3 = 0;}
	
	else if (g4.equalsIgnoreCase("A") || g4.equalsIgnoreCase("A-") || g4.equalsIgnoreCase("A+")){gr4 = 4;}
	else if (g4.equalsIgnoreCase("B") || g4.equalsIgnoreCase("B-") || g4.equalsIgnoreCase("B+")){gr4 = 3;} 
	else if (g4.equalsIgnoreCase("C") || g4.equalsIgnoreCase("C-") || g4.equalsIgnoreCase("C+")){gr4 = 2;} 
	else if (g4.equalsIgnoreCase("F")){gr4 = 0;}
	
	else if (g5.equalsIgnoreCase("A") || g5.equalsIgnoreCase("A-") || g5.equalsIgnoreCase("A+")){gr5 = 4;}
	else if (g5.equalsIgnoreCase("B") || g5.equalsIgnoreCase("B-") || g5.equalsIgnoreCase("B+")){gr5 = 3;} 
	else if (g5.equalsIgnoreCase("C") || g5.equalsIgnoreCase("C-") || g5.equalsIgnoreCase("C+")){gr5 = 2;} 
	else if (g5.equalsIgnoreCase("F")){gr5 = 0;}
	
	else if (g6.equalsIgnoreCase("A") || g6.equalsIgnoreCase("A-") || g6.equalsIgnoreCase("A+")){gr6 = 4;}
	else if (g6.equalsIgnoreCase("B") || g6.equalsIgnoreCase("B-") || g6.equalsIgnoreCase("B+")){gr6 = 3;} 
	else if (g6.equalsIgnoreCase("C") || g6.equalsIgnoreCase("C-") || g6.equalsIgnoreCase("C+")){gr6 = 2;} 
	else if (g6.equalsIgnoreCase("F")){gr6 = 0;}

	else if (g7.equalsIgnoreCase("A") || g7.equalsIgnoreCase("A-") || g7.equalsIgnoreCase("A+")){gr7 = 4;}
	else if (g7.equalsIgnoreCase("B") || g7.equalsIgnoreCase("B-") || g7.equalsIgnoreCase("B+")){gr7 = 3;} 
	else if (g7.equalsIgnoreCase("C") || g7.equalsIgnoreCase("C-") || g7.equalsIgnoreCase("C+")){gr7 = 2;} 
	else if (g7.equalsIgnoreCase("F")){gr7 = 0;}
	
	else if (g8.equalsIgnoreCase("A") || g8.equalsIgnoreCase("A-") || g8.equalsIgnoreCase("A+")){gr8 = 4;}
	else if (g8.equalsIgnoreCase("B") || g8.equalsIgnoreCase("B-") || g8.equalsIgnoreCase("B+")){gr8 = 3;} 
	else if (g8.equalsIgnoreCase("C") || g8.equalsIgnoreCase("C-") || g8.equalsIgnoreCase("C+")){gr8 = 2;} 
	else if (g8.equalsIgnoreCase("F")){gr8 = 0;}
	
	
	System.out.println("Your unweighted GPA for this term is " + ((gr1+gr2+gr3+gr4+gr5+gr6+gr7+gr8)/8));
	
	bot.close();



	}

}
