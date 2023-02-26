package week2.day6;

public class CharOccurance {
	
		public static void main(String[] args) {
			//initialize the String
			String input="Testleaf";
			// convert string to charArray
			char[] name=input.toCharArray();
			//initialize county variable as 0
			int count=0;
			//iterate the charArray
			for(int i=0;i<name.length;i++) 
			{
				//check the e occurrence increment count value
				if(name[i]=='e') 
					count++;
					}
			//print the count
			System.out.println(count);
			}
}


