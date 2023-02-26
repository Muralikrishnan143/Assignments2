package week2.day6;

public class PrintDuplicate {
	
	public static void main(String[] args) {
		//declare the array
		int[] arr= {11,22,33,44,55,66,22,77,11};
		//using nested for loop to iterate intArray
		for(int i=0;i<arr.length;i++)
		{
			for(int l=i+1;l<arr.length;l++)
			{
				//compare both array value same
				if(arr[i]==arr[l]) 
				{
					System.out.println(arr[i]);
					
				}
				
			}
		}
	}

}
