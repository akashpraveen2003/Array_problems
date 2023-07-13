package basic_array_problems_1;

import java.util.Scanner;

/**
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Input
	A = [2, 1, 2]
Output
	1
Input
	A = [2]
Output
	-1
*/
public class Second_largest {
	private static int  second_largest_element(int[] array) {
		// TODO Auto-generated method stub
		int maximum=array[0];
		int second_maximum=-1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i]<maximum && array[i]>second_maximum)
			{
				second_maximum=array[i];
			}
			if(array[i]>maximum)
			{
				second_maximum=maximum;
				maximum=array[i];
			}
		}
		return second_maximum;
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
		System.out.println(second_largest_element(array));
	}

	

}
