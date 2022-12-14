package conditionalStaments;

public class NestedIfElseCondtions {
 public static void main(String[] args) {
	 
		/*
		 * syntax: if(condition) { code block } else if(condition) { code block } else {
		 * code block }
		 */
	 
	 
	 
	// Set of Code to Execute NestedIfElse statements

			//code to print string values
			String Language= "C";
			
			if(Language == "Java") {
				System.out.println(Language+" is a good language");
			}
			else if (Language=="python") {
				
				System.out.println(Language+" is a good language");
			}
			else {
				System.out.println(Language+" language not found");
			}
			
			//Code to print Integer values
			
			int number = -5;
			
			if(number >0) {
				System.out.println(number+" is greater than 0");
			}
			else if(number <0) {
				System.out.println(number+" is lesser than 0");
			}
			else {
				System.out.println(number+" is equal to 0");
			}

}

}
