package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;

/**
Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal.

Input
A = [2, 4, 1, 3, 2]

Output
8
*/
public class Time_to_Equality {

	private static int make_array_elements_equal(int[] array) {
		// TODO Auto-generated method stub
		int counter=0;
		int max=array[array.length-1];
		for(int i=0;i<array.length-1;i++)
		{
			counter+=max-array[i];
		}
		return counter;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int array_size=scanner.nextInt();
		int array[]=new int[array_size];
		for(int i=0;i<array_size;i++)
		{
			array[i]=scanner.nextInt();
		}
		Arrays.sort(array);
		System.out.println(make_array_elements_equal(array));
	}

	

}
