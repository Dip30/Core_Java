package month.design;

public class ApplyEnum {

	/**
	 * Please design the following Feature in java.
	 */
	public static void main(String[] args) {
		/*
		 * Create an Enum called Month,then create a class to use that Month Enum where you
		 * will implement a method using switch...case. Once the whole use able process is done,
		 * create an object in this main method to demonstrate the Enum feature in java.
		 */
		Use_Enum u = new Use_Enum(Month.SEPTEMBER);
		u.Which_Month_It_Is();
		

	}

}
