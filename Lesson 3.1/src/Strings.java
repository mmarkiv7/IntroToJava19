
public class Strings {
	
	public static void main(String[] args){
	
	//1
	System.out.println("a\\b\\c\\\"d\"");
	//2
	System.out.println("\\t is a tab, \\n is a new line");
	//3
	System.out.println("\"line one\"\n\\line \t \\two\\");
	//4
	System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\*");
	//5
	System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\\\n\\\"\"\"\"\\");	
	//6	
	String bday = "Birthday";
	System.out.println(bday.toUpperCase());
	//7
	String party = "it's my party";
	String party2 = party.substring(0, 7);
	String partySmall = party.substring(8, 13);
	System.out.println(party2  + partySmall.toUpperCase());
	//8
	String whose = "\"whose a whats it\"";
	System.out.println(whose.substring(1,6).toUpperCase()+"\n"+whose.substring(15,16)+whose.substring(4,5)+" "+whose.substring(9,13).toUpperCase());
	//9
	String wind = "Every Way The Wind Blows";
	System.out.println(wind.substring(0,5).toLowerCase()+" "+wind.substring(6,9).toUpperCase()+" "+wind.substring(10,13).toLowerCase()+
	" \\"+wind.substring(14,18).toUpperCase()+"\\ "+wind.substring(19,24).toLowerCase()+" 4");
	//10
	String peepee = "Peter Piper Picked A Peck Of Pickled Peppers";
	System.out.println(peepee.substring(19,20)+" "+peepee.substring(21,36).toLowerCase()+"\t"+peepee.substring(37).toLowerCase()+
	" "+peepee.substring(0,11)+"\t"+peepee.substring(12,18).toLowerCase());
	//11
	String wordd = "word has 4 letters";
	System.out.println("\""+wordd.substring(9,10)+"\" "+wordd.substring(11)+" "+wordd.substring(5,8)+" \""+wordd.substring(9,18).length()+"\" "+wordd.substring(11));
	//12
	String subs = "if SUBSTRING is used";
	System.out.println(subs.substring(3,15).toLowerCase()+" "+subs.substring(3,12).length());
	//13
	String names = "Jim, Jacky, Johnny, Jill";
	System.out.println(names.substring(0,3).toLowerCase()+"\\"+names.substring(0,3).length()+"\n"+names.substring(5,10).toUpperCase()+"\\"+
	names.substring(5,10).length()+"\n"+names.substring(12,18).toLowerCase()+"\\"+names.substring(12,18).length()+"\n"+
	names.substring(20).toUpperCase()+"\\"+names.substring(20).length());
	
	
	
	
	
	
	
	//System.out.println(x.substring(2,6).toUpperCase());
	
		
		
		
		
		
	}
	
}
