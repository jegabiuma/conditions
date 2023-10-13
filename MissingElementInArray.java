package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] i = {1,2,3,5,7,6,8};
		
		Arrays.sort(i);
		for (int j = 0; j <= i.length-1; j++) 
		{
		  if(j+1  == i.length)
				break;
			if(i[j+1] == i[j]+1)
				continue;
			else
				System.out.println(i[j] + 1+ " is missing number");	

		}
		
			//System.out.println(i[1]);
			//System.out.println(i[2]);
			//System.out.println(i[3]);
			//System.out.println(i[4]);
			//System.out.println(i[5]);
			
		
	
	}
	}


