package week2.day6;

import java.util.Scanner;

public class ReverseStringGiveInput {
	
	public static void main(String[] args) {
		
	     // declare the Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your input");
		//to store the user input in variable
		String val=scan.nextLine();
		//convert string to char Array
		char[] charArray=val.toCharArray();
		//iterate charArray in reverse
		for(int i=charArray.length-1;i>=0;i--)
		{
			//print the charArrayy
			System.out.print(charArray[i]);
		}
		
		
		
	}

}
