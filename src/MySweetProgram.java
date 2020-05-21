import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {

	
	public static void main(String[] args) {
		//Inheritance: in order to pass down methods and fields from derived classes. 
		Student s = new Student();
		s.major = "Mustache design";
		System.out.println(s.major);
		System.out.println("the first name should be empty: " + s.firstName);
		//'virtual' concept: override base class method with new derived class method.
		//inside of Java 'virtual' is defined implicitly.
		//static and private methods cannot be virtual. 
		s.firstName = "Joe";
		s.lastName = "Morten";
		s.sayHello();
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