package conditionalStaments;

public class IfElseCondition {

	public static void main(String[] args) {
		
		/*
		 * Syntax:
		 * 
		 * if(condition) { //code block } else { //code block }
		 */ 
       int age = 20;
		
		System.out.println("-----------------------print Eligible for vote-----------------------");
		if(age >=18) {
			System.out.println("Candidate is eligible for vote with "+age+" years of age");
		}
		else {
			System.out.println("Candidate is not eligible for vote" +age+" years of age");
		}
		
		// Code to test even or odd 
		System.out.println("-----------------------print odd or even-----------------------");
		int num = 20;
		
		if(num%2==0) {
			
			System.out.println("The Given number "+num+" is even");			
		}
		else {
			System.out.println("The Given number "+num+" is odd");
		}
		
		// Code to test largest of 2 numbers 
		System.out.println("-------------------------Print largest of 2 numbers-----------------");
		
		int a = 20;
		int b = 10;
		if (a>b) {
			System.out.println(a+" is Largest number than "+b);
			
		}
		else {
			System.out.println(b+" is Largest number than "+a);
		}


	}

}
