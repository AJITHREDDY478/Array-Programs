package arrays;

import java.util.Scanner;

public class AvgArray2 {
	public static void main(String[] args) {

		/**
		 * Find the counts of elements of an unsorted integer array which are
		 * equal to the average of all elements of that array. Ex: Input Case 1:
		 * input: [2,2,2,2,2] output: 5 solution : 2+ 2+ 2+ 2+ 2 = 10/5 ==> 2 it
		 * contain five 2 element
		 * 
		 * Input Case 2: input: [ 1,3,2,4,5] output: 1 solution : 1+ 3+ 2+ 4+ 5
		 * = 15/5 ==> 3 it contain one 3 elemen
		 */
		System.out.println("enter the size of the array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0, sum = 0, total = 0;

		System.out.println("enter the elements of an array");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("\nsum of an array is : " + sum);

		total = sum / 5;
		for (int i = 0; i < arr.length; i++) {
			if (total == arr[i]) {
				count++;
			}
		}
		System.out.println("avrg of  array is : " + total);
		System.out.println("count of avg of array is : " + count);

	}
}
