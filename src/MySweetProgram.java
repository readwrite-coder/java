import java.util.Scanner;

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
		/*
		 *  + addition
		 *  - minus
		 *    division
		 *  * multiplication
		 *  % modulus
		 *  ++, -- changes value of variable, so type matters
		 */
		
		//methods for integer class
		Integer.max(10,20); //static method, we dont need to create an instance of a class
		Integer.compare(4, 1);
		String money = "300";
		Integer a = Integer.valueOf(money);
		int e = Integer.parseInt(money);
		
		String xx = "hello"; //object(instance of a class)
		//string = new String does not need to be called as exception
		System.out.println("should be h, "+ xx.charAt(0));
		System.out.println("string has length: "+ xx.length());
		System.out.println("does string xx contain el: " + xx.contains("el"));
		System.out.println(xx.indexOf("lo", xx.indexOf("lo"+1)));
		
		String fullAd = "yummmm .. MY OH MY chicken pot pie";
		System.out.println(fullAd.substring(10,18));
		System.out.println(fullAd.contentEquals("hello"));
		String password = "password";
		System.out.println("guess the password: ");
		
		//Scanner scanner = new Scanner(System.in);
		//String guess = scanner.nextLine();
		//System.out.println(password.contentEquals(guess));
		//2:01 
		
		//intro to OOP
		User user = new User();
		user.name = "Andrew";
		user.lastName = "Trinh";
		System.out.println(user.getFullName());
		//objects cannot use == operator because
		//objects in java are memory locations --> String.intern 
		//return; //return method just ends the method it is in
		
		System.out.println("How old are you?");
		Scanner scanner = new Scanner(System.in);
		int age = Integer.parseInt(scanner.nextLine());
		System.out.println("Cats or dogs?");
		String animal = scanner.nextLine();
		if(age > 12 && animal.contentEquals("dogs"))
		{
			System.out.println("dogs are cool!");
		}
		switch(animal) {
		case "Cats":
			System.out.println("Cats?really?");
			break;
		case "claire":
		case "Claire":
			System.out.println("No claire!");
			break;
		default:
			System.out.println("Hasta la vista!");
			break;
		}
		
		//ternary operator - takes 3 operands//5 is what happens when T and 10 when F
		int welcome = animal.contentEquals("Claire") ? 5 : 10;
		boolean welcomes = false;
		if(animal.toLowerCase().contentEquals("claire")) welcomes = true;
		System.out.println("Bye, bye");
		return;
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