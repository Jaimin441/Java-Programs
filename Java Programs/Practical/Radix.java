import java.io.*;
import java.util.*;

class Radix {

	static void countSort(int array[], int n, int exponential)
	{
		int output[] = new int[n];
		int i;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		for (i = 0; i < n; i++)
			count[(array[i] / exponential) % 10]++;

		for (i = 1; i < 10; i++)
			count[i] += count[i - 1];

		for (i = n - 1; i >= 0; i--) {
			output[count[(array[i] / exponential) % 10] - 1] = array[i];
			count[(array[i] / exponential) % 10]--;
		}

		for (i = 0; i < n; i++)
			array[i] = output[i];
	}

	static int getMaximum(int array[], int n)
	{
		int max = array[0];
		for (int i = 1; i < n; i++)
			if (array[i] > max)
				max = array[i];
		return max;
	}

	static void radixsort(int array[], int n)
	{
		int m = getMaximum(array, n);
		for (int exponential = 1; m / exponential > 0; exponential *= 10)
			countSort(array, n, exponential);
	}

	static void print(int array[], int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of an array : ");
		int n = sc.nextInt();

		int array[] = new int[n];

		System.out.println("Enter the array : ");
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}

		radixsort(array, n);

		System.out.println("After sorting array : ");
		for(int i=0; i<n; i++) {
			System.out.println(array[i] + " ");
		}
	}
}
