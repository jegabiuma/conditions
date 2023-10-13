package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int num=9;
		 boolean j = false;
		for (int i = 2; i <= num/2; i++)
		{
		if(num %i==0)
		{
			j=true;
			break;
		}
		}
		
		if(!j)
		{
			
			System.out.println(num+" prime number " );
			
		}
		else
		{
				
		System.out.println(num+" not prime number " );
		}
}
	}
