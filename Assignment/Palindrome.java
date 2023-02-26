package week2.day6;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//declare the String
		String pal="madam";
		// to store single character in array
		char[] charArray=pal.toCharArray();
		//declare empty String 
		String rev="";
		//iterate  the charArray
		for(int i=charArray.length-1;i>=0;i--)
		{
			//stored the string in reverse order
			rev=rev+charArray[i];
			System.out.println(rev);
		}
	      //To check the given String equal to reversed String
		if(pal.equals(rev))
		{
			
			System.out.println("palindrome");
			
		}
		else{
			System.out.println("not palindrome");
		}
		
		
			}

}
