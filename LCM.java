package easylevel;
import java.util.*;
public class LCM {
public static void main(String[]args) {
	int temp, lcm;
	Scanner sc=new Scanner(System.in);
	int num1=sc.nextInt(),num2=sc.nextInt();
	lcm=(num1>num2)? num1:num2;
	temp=lcm;
	while(true) {
		if(temp%num1==0&&temp%num2==0) {System.out.println(temp);
	break;	}
	temp+=lcm;	
	}
}
}
