package math.problem;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 
		 * 1,2,3,4,5,10,12,14,16,18,23,26,29,32,35,40,44,48,52,56,61,66,71,76,81.......n
		 * 
		 */
		int Value = 1, Increment = 1;
		for(int Pos = 1; Pos<= 25; Pos++)
		{
			System.out.println(Value);
			
			if(Pos%5 == 0)
			{
				Value += 5;
				Increment++;
			}
			else{
				Value += Increment;
			}
			
		}
	}

}
