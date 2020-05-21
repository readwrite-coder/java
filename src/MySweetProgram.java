//import java.util.Scanner;

public class MySweetProgram {
	
	//global variables should be final or private
	
	public static void function() {
		System.out.println("this is the function method inside the mysweet program class");
	}
	
	public static void main(String[] args) {
		System.out.println("what is your name!");
		//Scanner scanner = new Scanner(System.in);
		//packages are what we import, java package contains util and scanner
		//java.util.Scanner scanner = new java.util.Scanner(System.in);
		//String name = scanner.nextLine();
		//System.out.println("hello " + name);
		
		String string = new String("This is a string");
		System.out.println(string + ":)");
		
		int x = 5; //primitive
		Integer y = 5; //object (5 is autoboxed)
		
		final double PI = 3.14; //constant, by convention is capitalized
		System.out.println("PI is "+ PI);
		//PRIMITIVE TYPES:
		boolean isPizzaDelicious = true;
		byte b = 'C'; //based on ASCII characters
		char c = 'Z';
		short s = 3268; //small numbers
		int i = 243242; //larger than short
		long l = 50L;
		float f = 20.5f;//only get error when trying to smaller larger thing in smaller thing
		double d = 20.5; //float is smaller container than double
		
	}
	


}
//java is case sensitive
//function signatures rely on different arguments that a method takes
//arguments and parameters are what methods take
//operators: act on operands, such as data types
//data type: how the computer interprets the data
//java is statically typed language; needs to know variable types up front prior to compilation
//in javascript, variables can have different types unknown prior to run time. 
//catagories of datatypes: 
//primitive types: boolean, byte, char, short, int, long , float and double. (way we create is different)
//objects: String class allows us to make an object, or instance of the class. (unlimited object types)
//statically vs dynamically typed languages:
//variable creation:
//1. declare, 2. initialize