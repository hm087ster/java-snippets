package Test;

public class Switch {

	public static void main(String[] args) {
		
	
	System.out.println(getMonthName(1));

	}
	
	public static String getMonthName(int monthNum) {
	String monthName ="";
	
	switch(monthNum) {
	
	case 0:
		monthName="January";
		break;
	case 1:
		monthName="February";
		break;	
	default:
		monthName="Out of bounds";
		break;
	}
	return monthName;
	
	}

}
