package basic_array_problems_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.

Test Cases:
Input 
A = [1,2,3,4]
B = 7

Output
1
Input
A = [1,2,4]
B = 4

Output
0
Input
A = [1,2,2]
B = 4

Output
1
*/
public class Good_pair {

	private static int good_pair_hashMap(int[] array, int search_element) {
		// TODO Auto-generated method stub
		HashSet<Integer> map=new HashSet<>();
		for(int i=0;i<array.length;i++)
		{
			int element=array[i];
			if(map.contains(search_element-element))
			{
				return 1;
			}
			else
			{
				map.add(element);
			}
		}
		return 0;
	}
	private static int good_pair(int[] array, int search_element) {
		// TODO Auto-generated method stub
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]+array[j]==search_element)
				{
					return 1;
				}
			}
		}
		return 0;
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
		int element=scanner.nextInt();
	//	System.out.println(good_pair_hashMap(array,element));
		System.out.println(good_pair(array,element));
	}

	

}
