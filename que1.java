package cwh_practice_set;
import java.util.Scanner;
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("******TO PRINT THE SUM OF THREE NUMBERS\n"+"Enter three numbers:-\n"+"NUMBER 1-->");
Scanner num=new Scanner(System.in);
float first=num.nextFloat();
System.out.print("\nNUMBER 2-->");

float second=num.nextFloat();	
System.out.print("\nNUMBER 3-->");

float third=num.nextFloat();		
	float sum= first+second+third;
	System.out.println("The sum of the entered numbers is "+sum);
	}
}
