package week2.day6;

import java.util.Arrays;

public class MissingElement {
	
	public static void main(String[] args) {
		//declare the Array
		int[] text= {2,5,6,8,9,1,3,4};
		//sort the Array
		Arrays.sort(text);
		//iterate intArray using for loop
		for(int i=0;i<text.length;i++)
		{
			//to check array value equal to length+1
			if(text[i]!=i+1) {
				
				int l=i+1;
				
				System.out.println(l);
				break;
				
			}
		}
		
	}
}