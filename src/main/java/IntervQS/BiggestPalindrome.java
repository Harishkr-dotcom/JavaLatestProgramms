package IntervQS;

public class BiggestPalindrome {
	public static void main(String[] args) {
		int[] nums = {1, 2342, 55454545, 9090940, 1641};
		System.out.println(BiggestPalindrome(nums));

	}

	public static String BiggestPalindrome(int[] nums)
	{
		int bigNumber=Integer.MIN_VALUE;
		int secondBigNumber=Integer.MIN_VALUE;
		
		for(int num: nums)
		{
			if(num>bigNumber)
			{
				/* System.out.println("checking big number: "+num); */
				if(isPalindrome(num))
				{
					secondBigNumber=bigNumber;
					bigNumber=num;
					/*
					 * System.out.println("new big number: "+bigNumber);
					 * System.out.println("new second big number: "+secondBigNumber);
					 */
				}
					
			}
			
			else if((num>secondBigNumber) && (num<bigNumber))
			{
				/* System.out.println("checking second big number: "+num); */
				if(isPalindrome(num))
				{
					secondBigNumber=num;
					/* System.out.println("new second big number: "+secondBigNumber); */
				}
			}
				
		}
		
		return Integer.toString(bigNumber);
	}
	
	
	public static boolean isPalindrome(int num)
	{
		String number = Integer.toString(num);
		int[] char_set =new int[128];
		boolean oddOccurance=false;
		
		for(char ch:number.toCharArray())
		{
			char_set[ch]++;
		}
		
		for(int count:char_set)
		{
			if(count%2==1)
				oddOccurance=true;
		}
		
		if((number.length()%2!=0)&&(!oddOccurance))
		{
			return false;
			
		}
		else if((number.length()%2==0)&&(oddOccurance))
		{
			return false;
		}
		return true;
	}

}
