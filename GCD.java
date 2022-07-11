package easylevel;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {int num,den,rem;
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Enter the two numbers ");
int num1=sc.nextInt(),num2=sc.nextInt();
num=(num1>num2)?num1:num2;
den=(num1<num2)?num1:num2;
rem=num%den;
while(rem!=0) {
	
	num=den;
	den=rem;
	rem=num%den;
}System.out.println("The gcd of the given numbers is "+den);
	}

}
