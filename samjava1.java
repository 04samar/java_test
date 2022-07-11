package sam1;

public class samjava1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********ADDITION OF TWO ARRAYS***********\n");
	int a[]=new int[5],b[]=new int[5],c[]=new int[5];int num =5;
System.out.println("a:");
for(int i=0;i<5;i++) {a[i]=i;System.out.print("  "+a[i]+" ");}
System.out.println("\nb:");
for(int i=0;i<5;i++) {b[i]=num;num++;System.out.print("  "+b[i]+" ");}		
System.out.println("\n the sum of two arrays a[] and b[] is :");
for(int i=0;i<5;i++) {c[i]=a[i]+b[i];System.out.print("  "+c[i]+" ");
}	
}
}