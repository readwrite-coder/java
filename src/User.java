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
	public static int searchList(List<User> users, User u) {
		return searchList(users, u.getFullName());
	}
	//Now we want to return custom user object
	public static User findUser(List<User> users, User u) {
		for(User user : users) {
			if (user.equals(u)) {
				return user;
			}
		}
		return null;//check for null to see if value is found.
	}
	
	
	@Override
	public String toString() {
		return "User [getFullName()=" + getFullName() + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		//if (firstName == null) {
		//	if (other.firstName != null)
		//		return false;
		//} else if (!firstName.equals(other.firstName))
		//	return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	
	
	
}
