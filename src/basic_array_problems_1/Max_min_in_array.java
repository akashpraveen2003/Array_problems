package basic_array_problems_1;

import java.util.Arrays;
import java.util.Scanner;

public class Max_min_in_array {
	private static int sum_of_max_min(int[] array) {
		// TODO Auto-generated method stub
		
		Arrays.sort(array);
		if(array.length==1)
		{
			return array[0];
		}
		return array[0]+array[array.length-1];
		
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
		System.out.println(sum_of_max_min(array));
		

	}


}
