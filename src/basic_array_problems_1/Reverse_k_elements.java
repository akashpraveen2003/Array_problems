package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;

/**
Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].

Test Cases:

Input
	A = [1, 2, 3, 4]
	B = 2
	C = 3

Output
	[1, 2, 4, 3]
Input
	A = [2, 5, 6]
	B = 0
	C = 2

Output
	[6, 5, 2]
*/

public class Reverse_k_elements {
	private static void reverse_k_elements(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		int i=start;
		int j=end;
		while(i<j)
		{
			int temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}
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
		int start=scanner.nextInt();
		int end=scanner.nextInt();
		reverse_k_elements(array,start,end);
		System.out.println(Arrays.toString(array));

	}
}
