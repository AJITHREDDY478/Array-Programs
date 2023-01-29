
package arrays;

import java.util.Scanner;

public class AntiClockWiseRotate {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("entr the elements:");
		for(int i=0;i<n;i++)
			a[i]=scan.nextInt();
		System.out.println("please enter the number of rotation:");
		int k=scan.nextInt();
		for(int i=0;i<k;i++)
		{
			int temp=a[0];
			for(int j=0;j<n-1;j++)
			{
				a[j]=a[j+1];
			}
			a[n-1]=temp;
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}
}
