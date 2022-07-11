package cwh_practice_set;

public class practice_set_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*QUESTION 1
		String name="Samar Preet Singh";
		System.out.println(name.toLowerCase());*/
/*QUESTION 2
		String name="Samar Preet Singh";	
		System.out.println(name.replace(" ","_"));*/
/*QUESTION 3	
	String letter = "Dear <|name|> , thanks a lot!";
	System.out.println(letter.replace("<|name|>","Samar"));*/
/*QUESTION 4		
	String mystring = "This string contains   double and triple    spaces";
	System.out.println(mystring.indexOf("     "));//5 spaces: output should be -1
	System.out.println(mystring.indexOf(""));//NO SPACE: output will show index 0 as clear from the string
	System.out.println(mystring.indexOf("  "));//DOUBLE SPACES
	System.out.println(mystring.indexOf("   "));//TRIPLE SPACES
	
	/*Both double and triple spaces will show 
	at the same index because triple space contains double spaces too!*/ 

		//QUESTION 5
System.out.println("\"Dear Harry,this Java course is nice. Thanks.\"");
		                       
                         //OR THE OTHER WAY IS:-
String letter = "\"Dear Harry,this Java course is nice. Thanks.\"";
System.out.println(letter);
	}

}
