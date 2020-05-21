import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {
	
	//global variables should be final or private
	//functions must be declared and initialized
	//function declarations should appear at the top, near the header
	
	int field_variable = 5; //when we create variable outside a method but inside a class, known as 'field'
	
	//fields can be public or private
	
	public static void main(String[] args) {
		System.out.println("Welcome to object-oriented programming!");
		//intro to object-oriented programming
		//create large applications without the need to code everything ourselves
		//class defines a structure that can be instantiated many times
		//class defines a blueprint that can be instantiated to make number objects of a type of class
		//when we create a class we are creating a custom type
		
		User me = new User();
		//me.lastName = "Trinh";
		//me.firstName= "Andrew";
		//can no longer access once class-level field variables are declared private.
		me.setFirstName("Andrew");
		//me.lastName = "Trinh"; the field user.lastName is not visible.
		me.setLastName("Trinh");
		User teacher = new User();
		teacher.setFirstName("Caleb");
		teacher.setLastName("Curry");
		
		me.getFullName();
		String message = me.getFullName();
		message += " " + teacher.getFullName();
		//working with lists of custom types.
		List<User> users = new ArrayList<User>();
		users.add(me);
		users.add(teacher);
		for(int i = 0; i < users.size(); i++) {
			System.out.println("hi: "+ users.get(i).getFullName());
		}
		
		String[] firstNames = {"Josh", "Lane", "Kevin"};
		String[] lastNames = {"Rosen", "Nelson", "Ulman"};
		for(int i = 0; i < firstNames.length; i++) {
			User u = new User();
			u.setFirstName(firstNames[i]);
			u.setLastName(lastNames[i]);
			users.add(u);
		}
		//prints out all of the new objects located in our 'users' List
		for(User p : users) {
			System.out.println("hola " + p.getFullName());
		}
		//Let's create a method that takes a user as an argument.
		//we define method 'printUser' within this class, must instantiate class to invoke method.
		MySweetProgram m = new MySweetProgram();
		m.printUser(users.get(0));
		//the whole idea behind something being static is that it is attached
		//to a class rather than an instance of a class or an object
		//difference between 'static method' vs. 'instance method'
		//when you define an object, you can call methods within the context of a specific object instance.
		//static methods are called on an entire class, not object instance.
		List<User> users_2 = new ArrayList<User>();
		users_2.add(me);
		users_2.add(teacher);
		int id_users_2 = 2;
		int id_users = 1;
		User.printUsers(users_2, id_users_2);
		User.printUsers(users, id_users);
		//think about how main is a static function. 
		//within the class main resides, main static function can be called, 
		//but not within the context of a instance of the class being defined.
		
		// method overloading: methods can have different signatures,
		// invoking different functions. must be altered at the parameter level, return type not enough.
		System.out.println(User.searchList(users,"Andrew", "Trinh"));
		System.out.println(User.searchList(users,"Andrew", "Ulman"));
		System.out.println(User.searchList(users,"Kevin", "Ulman"));
		
		//method overwriting: replacing a method in a sub class, or derived class.
		//in OOP, we can have an inheritance hierarchy. 
		//methods are inherited from base class to derived classes.
		//derived classes giving new versions for methods that were originially definied in base class.
		//how to override to to-string method?
		//toString() is also implicitly called when class object is printed to console.
		System.out.println(teacher.toString());
		//toString() is a system method that is the base class of all derived classes in Java.
		//we can override the base method toString() by defining overide in our 'User' class.
		System.out.println(teacher);
		User uu = new User();
		uu.setFirstName("Fred");
		uu.setLastName("Ulman");
		users.add(uu);
		for(User p : users) {
			for(User q : users) {
				if(p.equals(q)) {
					System.out.println(p + " has the same last name as " + q);
				}
			}
		}
		
		System.out.println(User.searchList(users, teacher));
		User user_z = User.findUser(users, me);
		System.out.println(user_z);
		User user_x = User.findUser(users_2, uu);
		System.out.println(user_x);
		
		//'new' creates a new instance of a class, stored in variable 'me'
		//in Java everything is organized into classes
		
		// 1. encapsulation 2. inheritance 3. polymorphism
		// 3 pillars of object-oriented programming
		//Encapsulation: hide inner details, such as with class-level variables.
		//examples of encapsulation involve getter and setter methods that interface 
		//with class-level variables without the need to understanding details of variable.
		
		
		
		return;
	}
	
	//method here is not static and is defined within this mySweetProgram class, 
	//we need to make an instance of it. OR how to turn it to static method?
	public void printUser(User u) {
		System.out.println(u.getFullName());
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