package basic_array_problems_1;

import java.util.Scanner;
/**
Given an array A of 'n' integers. 
Count the number of elements that have at least 1 elements greater than itself.

Test Cases:
Input
A = [3, 1, 2]

Output
2
Input
A = [5, 5, 3]

Output
1
*/
public class Count_elements_greater_than_itself {

	private static int Count_elements(int array[],int size)
	{
		int count=0;
		int max_element=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(array[i]>max_element)
			{
				max_element=array[i];
				count=1;
			}
			else if(array[i]==max_element)
			{
				count++;
			}
		}
		return size-count;
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
		System.out.println(Count_elements(array,array_size));
	}

}
