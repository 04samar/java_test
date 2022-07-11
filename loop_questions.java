package cwh_practice_set;
import java.util.Scanner;
public class loop_questions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.println("^^^^^^^^^^^^TO PRINT THE PATTERN^^^^^^^^^^^^^");
		for(int row=1;row<=4;row++) {
	for(int col=4;col>=row;col--) {
		System.out.print("*");
		}
	System.out.print("\n");
}*/
		
/*System.out.println("***************SUM OF FIRST N EVEN NUMBERS USING WHILE LOOP*******************");
System.out.print("ENTER n : ");		
Scanner num=new Scanner(System.in);
int n=num.nextInt(),i=1;
while(i<=n)
{System.out.println(2*i);	
i++;
}	*/
	
/* QUESTION 3 : TO PRINT MULTIPLICATTION TABLE OF A GIVEN NUMBER N
System.out.println("Enter the number whose table you wish to know : ");		
Scanner given=new Scanner(System.in);
int num =given.nextInt(),table=1;
while(table<=10) {System.out.println((num)+"*"+(table)+"="+( num*table));
table++;}*/
	
/* QUESTION 4 : TO PRINT TABLE OF 10 IN REVERSE ORDER
System.out.println("^^^^^^^^^^^^^^^^TABLE OF 10 IN REVERSE ORDER^^^^^^^^^^^^^^^^^^");
System.out.println("Enter the number whose table you wish to know : ");		
Scanner given=new Scanner(System.in);
int num =given.nextInt();
for(int table=10;table>=1;table--) {
	System.out.println((num)+"*"+(table)+"="+( num*table));
}*/
	
/*QUESTION 5 : FACTORIAL OF A GIVEN NUMBER 
System.out.println("Enter the number : ");
Scanner given=new Scanner(System.in);
int num =given.nextInt();
int i=num,factorial= 1;
while(i>=1) {factorial *= i; i--;
}System.out.print("The factorial of "+num+" is "+factorial+".");*/

/*QUESTION 6 : TO CALCULATE THE SUM OF NUMBERS OCCURING IN THE MULTIPLICATION TABLE. */
		System.out.println("Enter the number whose sum of multiplication table you wish to know : ");		
		Scanner given=new Scanner(System.in);
		int num =given.nextInt(),sum=0,table=1;
		while(table<=10) {System.out.println((num)+"*"+(table)+"="+( num*table));
		sum+=(num*table);
		table++;}		
System.out.print("The required sum is "+sum);



	}

}
