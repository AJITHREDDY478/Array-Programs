package arrays;

public class SmallestNumbInArray {
	public static int getSmallestNumb(int arr[], int n) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[0];
	}

	public static void main(String[] args) {
		int arr[] = { 22, -4, 5, 69, 32, -34, 4, 46, 52, 67, 45, 43, 6, 45, 72, 44, 659 };
		System.out.println(getSmallestNumb(arr, arr.length));
	}

}
