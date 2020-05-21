import java.util.List;

public class User {

	public String firstName;
	public String lastName;
	public boolean verified = false;
	//creating a method in 'User' class and overriding it in 'Student' class:
	public void sayHello() {
		System.out.println("Hi im a User, my name is " + firstName + " " + lastName);
	}
	
}
