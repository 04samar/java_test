package cwh_practice_set;
import java.util.Scanner;
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*float [] s= {4.1f,7.2f,16,19,22};
float sum=0;
for(int i=0;i<s.length;i++) {sum+=s[i];

}System.out.println(sum);
	  
	QUESTION 2  
	  int i;
	int [] arr= {59,62,34,86,97,22,45};
	System.out.print("Enter an integer : ");
	Scanner ger=new Scanner(System.in);
	boolean ispresent=false;
	int integer=ger.nextInt();
	for( i=0;i<arr.length;i++) {
		if(integer==arr[i]) {ispresent=true;}}
if(ispresent) {System.out.print("The entered number is present in the array");}
else {System.out.print("The entered number is  not present in the array");
}*/
		
/*	QUESTION 3
int sum=0;float average=0;	
		System.out.print("Enter the elements of the array");
		Scanner m=new Scanner(System.in);
		int [] marks=new int[10];
		for(int i=0;i<10;i++) {
			marks[i]=m.nextInt();
			sum+=marks[i];}	
		float len=marks.length;
		 average=sum/len;
		System.out.println(average);
	
/*QUESTION 4 
System.out.println("^^^^^^^^^^^^^^^^^^^^SUM OF TWO MATRICES^^^^^^^^^^^^^^^^^^^^^^^");
System.out.println("______________________________________________________________\n");
System.out.println("Enter the values of the first matrix : ");
Scanner mat=new Scanner(System.in);
int [] [] matrix=new int [2] [3];
for(int row=0;row<2;row++) {
	for(int col=0;col<3;col++) {
		matrix[row][col]=mat.nextInt();
	}
}
System.out.print("The first matrix is : \n");
for(int row=0;row<2;row++) {
	for(int col=0;col<3;col++) {
	System.out.print(matrix[row][col]);
	System.out.print(" ");
	}
	System.out.print("\n");
}
System.out.println("Enter the values of the second matrix : ");
int [] [] matrix2=new int [2] [3];
for(int row=0;row<2;row++) {
	for(int col=0;col<3;col++) {
		matrix2[row][col]=mat.nextInt();
	}
}
System.out.print("The second matrix is : \n");
for(int row=0;row<2;row++) {
	for(int col=0;col<3;col++) {
	System.out.print(matrix2[row][col]);
	System.out.print(" ");
	}
	System.out.print("\n");
}
System.out.println("The sum of the two matrices is : ");
for(int row=0;row<2;row++) {
	for(int col=0;col<3;col++) {
	System.out.print(matrix[row][col]+matrix2[row][col]);
	System.out.print(" ");
	}
	System.out.print("\n");
}*/
	
/*QUESTION 5
System.out.print("Enter the elements of the array : ");
Scanner arr=new Scanner(System.in)	;
int [] array=new int [6];

for(int i=0;i<array.length;i++) {
	array[i]=arr.nextInt();
	System.out.print( array[i]+" " );}
int temp;
for(int i=0;i<(array.length+1)/2;i++) {
	temp=array[i];
	array[i]=array[array.length-1 -i];	
	array[array.length-1-i]=temp;}
System.out.print("\nThe reversed array is ");
for(int i=0;i<array.length;i++) {
System.out.print(array[i]+" ");}*/
		
/*QUESTION6:	

		int arr[]=new int[10];int i;
		System.out.println("Enter the elements of the array: ");
		Scanner sc=new Scanner(System.in);
		
		for( i=0;i<10;i++) {
			arr[i]=sc.nextInt();
			}
		System.out.print("The entered array is : ");
		for( i=0;i<10;i++) {
		System.out.print(arr[i]+" ");}
			System.out.print("\nEnter the element whose index you want to find: ");
			int element=sc.nextInt();
			for( i=0;i<10;i++) {
				if(element==arr[i]) {System.out.print(i);
			break;	}}*/
	/*QUESTION 7
		int[]arr=new int[10];int[] copy=new int[10];int i;
		System.out.println("Enter the elements of the array: ");
		Scanner sc=new Scanner(System.in);
		for( i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		copy[i]=arr[i];}
		System.out.print("The entered array is : ");
		for( i=0;i<10;i++) {
		System.out.print(arr[i]+" ");}
		System.out.print("\n");
		System.out.print("The copied array is : ");
		for( i=0;i<10;i++) {
		System.out.print(copy[i]+" ");}*/
		
		//QUESTION 8
		int[] orig=new int[10];int[] new_arr=new int[orig.length+1];int i;
		System.out.println("Enter the elements of the array: ");
		Scanner sc=new Scanner(System.in);
		for( i=0;i<10;i++) {
			orig[i]=sc.nextInt();
			System.out.print(orig[i]+" ");}
		System.out.print("\n");
			System.out.print("Enter the element with its index number where you want to insert it : ");
			int element=sc.nextInt();int index=sc.nextInt();
			System.out.print("The new array is: ");
			for(i=0;i<orig.length+1;i++) {
				if(i==index) {new_arr[i++]=orig[i];
					new_arr[i]=element;}
				else {
				new_arr[i]=orig[i];}
				
				}
			for(i=0;i<orig.length+1;i++) {
			System.out.print(new_arr[i]+" ");}
				
	}
}

