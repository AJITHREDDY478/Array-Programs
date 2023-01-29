package arrays;

import java.util.Scanner;

public class ArrayMerge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter ist array:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("enter the number of elements:");
		int m=scan.nextInt();
		int b[]=new int[m];
		System.out.println("enter 2nd array:");
		for(int i=0;i<m;i++)
		{
			b[i]=scan.nextInt();
		}
	
		int c[]=new int[m+n];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i];
		}
		for(int i=n;i<m+n;i++)
		{
			c[i]=b[i-n];
		}
		for(int i=0;i<m+n;i++)
		System.out.print(c[i]+" ");
	}
}

