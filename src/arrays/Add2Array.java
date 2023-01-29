package arrays;

import java.util.Scanner;

public class Add2Array {

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
		int b[]=new int[n];
		System.out.println("enter 2nd array:");
		for(int i=0;i<n;i++)
		{
			b[i]=scan.nextInt();
		}
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<n;i++)
		System.out.print(c[i]+" ");
	}
}
