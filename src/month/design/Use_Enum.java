package month.design;

public class Use_Enum {
	Month month;
	
	Use_Enum(Month month){
		this.month = month ;
		
	}
	
	public void Which_Month_It_Is(){
		
		
		switch(month){
			case JANUARY:
				System.out.println("1st Month");
				break;
			case FEBRUARY:
				System.out.println("2nd Month");
				break;
			case MARCH:
				System.out.println("3rd Month");
				break;
			case APRIL:
				System.out.println("4th Month");
				break;
			case MAY:
				System.out.println("5th Month");
				break;
			case JUNE:
				System.out.println("6th Month");
				break;
			case JULY:
				System.out.println("7th Month");
				break;
			case AUGUST:
				System.out.println("8th Month");
				break;
			case SEPTEMBER:
				System.out.println("9th Month");
				break;
			case OCTOBER:
				System.out.println("10th Month");
				break;
			case NOVEMBER:
				System.out.println("11th Month");
				break;
			case DECEMBER:
				System.out.println("12th Month");
				break;
			default:
				System.out.println("Incorreect Input ");
				break;
		}
	}
				
		
	}


