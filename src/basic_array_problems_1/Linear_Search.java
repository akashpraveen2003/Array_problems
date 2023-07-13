package basic_array_problems_1;

import java.util.Scanner;

public class Linear_Search {

	private static int linear_search(int[] array, int element) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==element)
			{
				count++;
			}
		}
		return count;
		
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
		System.out.println(linear_search(array,element));
		

	}



}
