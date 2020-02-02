
public class User {
	//Fields(attributes)
	public String name;
	public int age;
	
	public User(String name,int age) {
		this.name = name;
		this.age  = age;
	}
	
	//Methods
	public void sayHello() {
		System.out.println("Hello,My name is " + name + ",");
		System.out.println("I am " + age + " young.");
		
	}
}
