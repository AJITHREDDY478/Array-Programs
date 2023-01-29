package arrays;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("entr the elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=scan.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		double avarage=(double)sum/n;
		System.out.println("avarage= "+avarage);
	}

}
