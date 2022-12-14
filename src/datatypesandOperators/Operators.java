package datatypesandOperators;

public class Operators {

	public static void main(String[] args) {
		int x = 10;
		double y = 20.5;
		
		//Arithmetic Operators  --> +,-,*,/,%
		 double addition = x+y; //addition
		 double subtraction = x-y; //subtraction
		 double multiplication = x*y; //multiplication
		 double division = x/y; //division
		 double modulus = x%y; //modulus
		 String a = "Welcome";
		 String b = "Selenium";
		 System.out.println("------------------Arthimetic Operators------------------");
		 System.out.println("Sum of x and y is: "+addition);
		 System.out.println("subtraction of x and y is: "+subtraction);
		 System.out.println("multiplication of x and y is :"+multiplication);
		 System.out.println("division of x and y is: "+division);
		 System.out.println("modulus of x and y is: "+modulus);
		 System.out.println(a +" "+ b);// string concatenation;
		 
		 // Relational operators(Comparison operators) --> ==,<,>,>=,<=,!=
		      // It always returns boolean values.
		 System.out.println("----------------comparision operators--------------------");
		 System.out.println(x==y);
		 System.out.println(x>y);
		 System.out.println(x<y);
		 System.out.println(x>=y);
		 System.out.println(x<=y);
		 System.out.println(x!=y);
		 
		 //Logical Operators && || !
		 
		 
		 boolean t = true;
		 boolean f = false;
		 System.out.println("------------logical operators------------------------");
		 System.out.println(t &&  f);
		 System.out.println(t || f);
		 System.out.println(!f);
		 
		 //Increment/decrement operators ++ --
		 
		 int s= 10;
		 int q = 16;
		  s++;
		  q--;
		  System.out.println("-----------------Increment/Decrement operators-------------------");
		  System.out.println("increment of s: " +s);
		  System.out.println("Decrement of q: "+q);
		  
		  System.out.println("---------------Swapping variable values---------------------");
		  
		  
		  int xy = 10;
		  int yz = 20;
		  System.out.println("before swap");
		  System.out.println("x= "+xy);
		  System.out.println("y= "+yz);
		  int temp  = xy;
		  xy = yz;
		  yz =temp;
		  System.out.println("After swap");
		  System.out.println("x= "+xy);
		  System.out.println("y= "+yz);
	}
	

}
