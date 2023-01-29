package arrays;

import java.util.Scanner;

public class LargeNumbInArray {
	public static int getLargestNumb(int arr[], int n) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("elements of an array is :");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		System.err.println( "The Largest Number in Array is : "+getLargestNumb(arr, size));
	}

}
