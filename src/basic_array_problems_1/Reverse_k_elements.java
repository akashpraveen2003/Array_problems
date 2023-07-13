package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;

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
