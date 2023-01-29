package arrays;

import java.util.Scanner;

public class InsertAndMoveToNext {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		a[i]=scan.nextInt();
		System.out.println("Please enter the index whose element is to be inserted:");
		int idx=scan.nextInt();
		int b[]=new int[idx];
		
		a[idx]=555;
		for(int i=0;i<n;i++)
			System.out.println(a[i]+" ");
	}

}
