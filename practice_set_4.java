package cwh_practice_set;
import java.util.Scanner;
public class practice_set_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*QUESTION 2 :STUDENT PASS OR FAIL
System.out.println("Enter the maximum marks for individual subject : ");
	Scanner m=new Scanner(System.in);
	int maxmarks=m.nextInt();
	int total_maxmarks = maxmarks*3;
System.out.print("Enter your marks in the three subjects\n"+"\nSUBJECT 1 - ");		
	
	int num1=m.nextInt();
System.out.print("\nSUBJECT 2 - ");
	
	int num2=m.nextInt();
System.out.print("\nSUBJECT 3 - ");
	
	int num3 = m.nextInt();
	int total = num1+num2+num3;
	
	if(num1>=0.33*maxmarks && num2>=0.33*maxmarks && num3>=0.33*maxmarks && total>=0.4*total_maxmarks)
		{System.out.println("Congrats man, You pass! :)");}
	else
		{System.out.println("Really sorry, you couldn't pass. :(");}*/
		
	/*QUESTION 3 
		System.out.print("Enter your income : ");
Scanner inc=new Scanner(System.in);
float income=inc.nextFloat();
if(income<2.5e5) {System.out.println("You don't have to pay any tax!:)");}
else if(income>=2.5e5&&income<5.0e5) {System.out.println("You have to pay an income tax of "+0.05*(income-2.5e5));}
else if(income>=5.0e5&&income<10.0e5) {System.out.println("You have to pay an income tax of "+(0.05*2.5e5+0.2*(income-5.0e5)));}
else if(income>=10.0e5) {System.out.println("You have to pay an income tax of "+(0.05*2.5e5+0.2*5.0e5+0.3*(income-10.0e5)));}*/

/*QUESTION 4
	System.out.println("Enter any number from 1 to 7");
	Scanner d=new Scanner(System.in);
	int day=d.nextInt();
	switch(day)
	{case 1 -> System.out.println("monday");
	case 2 -> System.out.println("tuesday");
	case 3 -> System.out.println("wednesday");
	case 4 -> System.out.println("thursday");
	case 5 -> System.out.println("friday");
	case 6 -> System.out.println("saturday");
	case 7 -> System.out.println("sunday");
	}*/
		
//QUESTION 5
System.out.print("********* TO FIND WHETHER A GIVEN YEAR IS A LEAP YEAR OR NOT *********");
System.out.print("\nEnter the year you wish to check for being leap year : ");
Scanner y=new Scanner(System.in);
int year=y.nextInt();
if(year%4==0) {
	if(year%100==0) {
		if(year%400==0)
			System.out.printf("%d is a leap year",year);
		else System.out.printf("%d is  not a leap year",year);
		}
	else System.out.printf("%d is a leap year",year);
	}
else System.out.printf("%d is not a leap year",year);}	
	
  }


