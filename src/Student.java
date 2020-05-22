public class Student extends User implements Talk{
	
	public boolean verified = true;
	public String major;
	
	//constructor looks like a method:
	public Student() {
		//System.out.println("creating a student");
		super();
	}
	//calling super() invokes constructor of base class.
	public Student(String fn, String ln) {
		super(fn, ln, fn+" " +ln);
		System.out.println("in Student constructor, calling super()");
	}
	
	@Override
	public void sayHello() {
		
		super.sayHello();
		
		System.out.println("Hi im a User, my name is " + firstName + " " + lastName
				+ " and I major in: " + major);
		//calling the base method, super.sayHello(), is disallowed, because..
		// disallowed because cannot invoke abstract method sayHello.
	}
	
}
