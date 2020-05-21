
public abstract class User {
//adding abstract disallows instantiation of instance of class object.
//results in programmer having to use derived class instance only.
	
	public String firstName;
	public String lastName;
	public boolean verified = false;
	private String full_name;
	
	public User() {
		System.out.println("creating user object");
	}
	public User(String fn, String ln, String full) {
		firstName = fn;
		lastName = ln;
		full_name = full;
		System.out.println("full name is: "+ full_name);
		System.out.println("in custom constructor invoked by super() call from inherited student constructor");
	}

	//creating a method in 'User' class and overriding it in 'Student' class:
	
	public String getFullName() {
		return full_name;
	}
	
	public void sayHello() {
		
		System.out.println("USERVERSION: Hi im a User, my name is " + getFullName());
	}
	
	//public abstract void sayHello(); 
	//you have to override this method because it is instantiated as abstract.
	//Abstract methods: when you make a method abstract, prevents you from having a body for method.

}
