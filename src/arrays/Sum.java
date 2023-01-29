package arrays;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number of elements:");
		int n=scan.nextInt();
		int [] a=new int[n];
		System.out.println("please enter elements:");
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
	}
	int sum=0;
	for(int i=0;i<n;i++) {
		sum=sum+a[i];
}
System.out.println("sum= "+sum);
}
}