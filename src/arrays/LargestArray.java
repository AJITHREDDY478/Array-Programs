package arrays;

import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int max=a[0];
		for(int i=1;i<n;i++)
		if(a[i]>max)
		{
			max=a[i];
		}
		System.out.println("max="+max);
	}

}
