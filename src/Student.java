public class Student extends User {
	
	public boolean verified = true;
	public String major;
	
	@Override
	public void sayHello() {
		System.out.println("Hi im a User, my name is " + firstName + " " + lastName
				+ " and I major in: " + major);

		//calling the base method, super.sayHello(), is disallowed, because..
		// disallowed because cannot invoke abstract method sayHello.
	}
	
}
