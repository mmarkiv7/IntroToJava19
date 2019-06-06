import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Array {
		
		public static void main(String []args) throws IOException{
		
			
		File file = new File("H:\\grades.txt\\");
		
		Scanner bot2 = new Scanner(file);
		
		
		while (bot2.hasNextLine());
            int i = bot2.nextInt();
            System.out.println(i); 
		
			
			
		Scanner bot = new Scanner(System.in);
		System.out.println("Enter your first grade");
		String sGrade = bot.nextLine();
		String sGrade2 = bot.nextLine();
		
		
		
		String[] grades = {"A", "A+", "A-", "B", "B+", "B-", "C", "C+", "C-", "D", "D+", "D-", "F"};
						  //0    1     2     3    4     5     6    7     8     9    10    11    12
		
		
		double[] gr = {4, 3, 2, 1, 0};
		
		double sl;
		
		if (grades[0].equalsIgnoreCase(sGrade) || grades[1].equalsIgnoreCase(sGrade) || grades[2].equalsIgnoreCase(sGrade)){
			sl = gr[4];	
		}
		
		else if (grades[0].equalsIgnoreCase(sGrade2)){
			
		}
			
			
			
		}
		

			
		}
		

