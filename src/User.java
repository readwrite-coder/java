import java.util.List;

public class User {
	//by convention, class name starts with uppercase
	//methods and properties, where properties are defined by fields
	//methods define which fields can be accessed (getter and setter for private fields)
	//fields can be public or private, but are outside any methods.
	//fields are class-level variables.
	
	//public fields can be access outside the class
	private String firstName;
	private String lastName;
	
	//class methods:

	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	public String getFirstName() { //getter for our private field, no way to assign value at this point
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}
	//STATIC METHOD IN User class.
	//this makes sense bc not tied to one specific user, 
	//so from calling program, we can have a list of users, which can be invoked.
	//static methods are like utility methods for the class
	public static void printUsers(List<User> users, int id) {
		for(User u : users) {
			System.out.println("Static call id version:"+ id + " " + u.getFullName());
		}
	}
	public static int searchList(List<User> users, String fn, String ln) {
		return searchList(users, fn + " " + ln);
	}
	public static int searchList(List<User> users, String fullName) {
		for(int i = 0; i < users.size(); i++) {
			if(users.get(i).getFullName().contentEquals(fullName)) {  // == not valid bc String object does not invoke operator like primitive types.
				return i;
			}
		}
		return -1;
	}
	
}
