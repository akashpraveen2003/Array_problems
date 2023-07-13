package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Rotation {

	private static void reverse(int[] array, int start, int end) {
		// TODO Auto-generated method stub
		while(start<end)
		{
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;
			end--;
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
		int rotate_bits=scanner.nextInt();
		reverse(array,0,array_size-1);
		reverse(array,0,rotate_bits-1);
		reverse(array,rotate_bits,array_size-1);
		System.out.println(Arrays.toString(array));

	}


}
