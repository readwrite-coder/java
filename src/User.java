import java.util.List;

public abstract class User {
//adding abstract disallows instantiation of instance of class object.
//results in programmer having to use derived class instance only.
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	//creating a method in 'User' class and overriding it in 'Student' class:
	
	//public void sayHello() {
	//	System.out.println("Hi im a User, my name is " + firstName + " " + lastName);
	//}
	
	public abstract void sayHello(); 
	//you have to override this method because it is instantiated as abstract.
	//Abstract methods: when you make a method abstract, prevents you from having a body for method.

}
