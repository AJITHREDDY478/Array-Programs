package arrays;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		/**
		 * Find the average of largest and smallest numbers in an unsorted
		 * integer array? 
		 * Eg. Input 
		 * Case 1: input: [1, 4, 3, 2] output: 2.5
		 * solution : average = (1+4)/2 =>5/2 => 2.5
		 * 
		 * input: [1, 4, 3, 4] output: 3 solution : average = (1+4 +4)/3 =>9/3
		 * => 3
		 */
		int[] a = { 1, 4, 3, 4, 3, 2, 1, 2, 3, 4, 1 };
		int temp;

		int max = a[0];
		int MaxCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				MaxCount = 1;
			} else if (a[i] == max) {
				MaxCount++;
			}
		}
		System.out.println("Maximum Number is : " + max);
		System.out.println("Maximum Number repeated : " + MaxCount + " Times");

		int min = a[0];
		int MinCount = 0;
		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				min = a[i];
				MinCount = 1;
			} else if (a[i] == min) {
				MinCount++;
			}
		}
		System.out.println("Minimum Number is : " + min);
		System.out.println("Minimum Number repeated : " + MinCount + " Times");

		temp = MaxCount + MinCount;
		System.out.println("Total Number of times Largest & Smallest number is repeated : " + temp);

		double c = max * MaxCount + min * MinCount;
		System.out.println("Sum of the Largest And Smallest Number is : " + c);

		double g = c / temp;
		System.out.println("Average of largest & Smallest Number : " + g);

	}

}
