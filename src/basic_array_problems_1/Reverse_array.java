package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;


public class Reverse_array {
	private static void reverse(int[] array) {
		// TODO Auto-generated method stub
		int i=0;
		int j=array.length-1;
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
		reverse(array);
		System.out.println(Arrays.toString(array));

	}

	

}
