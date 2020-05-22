
public class Teacher extends User implements Talk{

	@Override 
	public void sayHello() {
		System.out.println("I'm a teacher");
	}
}
