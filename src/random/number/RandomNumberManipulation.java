package random.number;

import java.util.Random;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   */

		int[] Array = new int[50];
		
		for(int i = 0; i< Array.length; i++)
		{
			Random Rn = new Random();
			Array[i] = Rn.nextInt(500);
			if(Array[i]%2 == 0)
			{
			  System.out.println(Array[i]);
			}
		}

	 
	}

	

}
