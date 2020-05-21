public class Student extends User {
	public boolean verified = true;
	public String major;
	@Override
	public void sayHello() {
		System.out.println("Hi im a User, my name is " + firstName + " " + lastName
				+ " and I major in: " + major);

		super.sayHello();
	}
	
}
