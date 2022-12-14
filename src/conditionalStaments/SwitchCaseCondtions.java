package conditionalStaments;

public class SwitchCaseCondtions {
	public static void main(String[] args) {
		//Syntax for Switch case
		
				/*
				 * switch(expression) { 
				 * case x: 
				 * // code block
				 *  break; 
				 *  case y: 
				 *  // code block
				 * break; 
				 * default: 
				 * // code block 
				 * }
				 */
				
				int day = 10;
				
				switch(day) {
				case 1 :
					System.out.println("sunday");
					break;
				case 2 :
					System.out.println("Monday");
					break;
				case 3 :
					System.out.println("tuesday");
					break;
				case 4 :
					System.out.println("wednesday");
					break;
				case 5:
					System.out.println("thursday");
					break;
				case 6 :
					System.out.println("fiday");
					break;
				case 7 :
					System.out.println("saturday");
					break;
				default:
					System.out.println("Invalid Week number");
				}
				

	}

}
