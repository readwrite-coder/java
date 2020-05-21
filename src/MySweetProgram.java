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
		//s.sayHello();
		
		//Polymorphism: at a general level, something can morph to different things.
		//Allows us to treat an object as different types of objects.
		//You can treat a student and treat it as both a 'teacher' and 'User'.
		//makes this possible: User u = new Student() .
		//and   this possible: Student u = new Student() . 
		
		//Must understand the inheritance hierarchy to implement polymorphism effectively.
		Teacher t = new Teacher();
		t.firstName = "Terry";
		t.lastName = "Andrews";
		List<User> users_3 = new ArrayList<User>();
		users_3.add(s);
		users_3.add(t);
		
		for(User u : users_3) {
			u.sayHello();
		}
		
		//Constructor: like a method - something we invoke.
		//no return type, and it invoked using the 'new' keyword.
		//The name of the constructor has to match the name of the class.
		//initializes value fields in class object. 
		//there is always a default constructor that is implicitly created.
		Student ss = new Student();
		User su = new Student();
		//REMEMBER: if you add custom constructor, the default constructor is not automatically created.
		Student first_grader = new Student("Henry","Jones");
		User villager = new Student("Tim", "Bradley");
		List<Student> kids = new ArrayList<Student>();
		//kids.add(villager);        //cannot add 'User' to 'Student' list.
		kids.add(first_grader);
		List<User> user_kids = new ArrayList<User>();
		user_kids.add(first_grader); //can add 'Student' to 'User' list bc all Students are Users.
		user_kids.add(villager);
		first_grader.sayHello();
		villager.sayHello();
		
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