package arrays;

import java.util.Scanner;

public class KeyPresent {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements:");
		for(int i=0;i<n;i++)
		a[i]=scan.nextInt();
		System.out.println("Please enter the key to search");
		int key=scan.nextInt();
		boolean presence=false;
		for(int i=0;i<n;i++)
		{
		if(key==a[i])
			presence=true;
		}
		if(presence==true)
			System.out.println("Key is present");
		else
			System.out.println("Key is not present");
		}
	}


