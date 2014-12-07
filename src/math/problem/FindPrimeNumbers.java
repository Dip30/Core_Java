package math.problem;

public class FindPrimeNumbers {

	/**
	 * Please do the flowing problem.
	 */
	public static void main(String[] args) {
	
		/* Find the prime numbers from 1 to 1000 then print to console.Also print out the total prime numbers within the range.
	(prime numbers are only divisible by number 1 and the number itself.)
	(for example numbers like 2,3,5,7,9,11,13.....n are prime numbers. 
		*/
		int Prime_num_Count = 0;
		
		for(int i = 1; i<=1000; i++)
		{
			int Count = 0;
			for(int j= 2; j<=i; j++)
			{
				if(i%j == 0)
				{
					Count++;
				}
			}
			if(Count == 1)
			{
				Prime_num_Count++;
				System.out.println(i);
			}
		}
		
		System.out.println("Total Count of Prime Number is: "+Prime_num_Count);
		

	}

}
