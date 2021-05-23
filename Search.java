//Search - searches the String for the value "h" in an if statement 

public class Search {

	public static void main(String[] args) {
		
		String str = "abcdefghijklmnopqrstuvwxxyz";
		
		if(str.indexOf("h")!= -1){
			System.out.println("h is part of str");
			
		} else {
			System.out.println("h is not part of str");
		}

	}

}
