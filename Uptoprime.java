package easylevel;

import java.util.Scanner;

public class Uptoprime {
	public static void main(String[] args) {int start,count,index;

Scanner sc=new Scanner(System.in);		
	System.out.println("Enter the number : ");
	int num=sc.nextInt();
	System.out.println("The prime numbers under "+num+" are :- ");
	if(num<2) {System.out.println("There is no prime number below 2!");}
	else {for(start=2;start<=num;start++) {count=0;
		for(index=2;index<start;index++) {
			if(start%index==0) count++;}
		if(count==0) System.out.println(start);
		}
	}
	
	}	}