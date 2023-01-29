package arrays;

public class Demo {
	
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 3,7, 8, 9,4,3,5,6,7,9,8 };
		int sum=0;
		for (int i = 0; i <a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println(a.length);
	}
}
