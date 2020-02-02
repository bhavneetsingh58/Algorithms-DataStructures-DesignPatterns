
public class Main {

	public static void main(String[] args) {
		//User user = new User("bhavneet",21);
		//user.name = "Bhavneet";
		//System.out.println(user.name);
		//user.sayHello();
		TaxCalculator calculator = getCalculator();
		//calculator.CalculateTax();
		System.out.println(calculator.CalculateTax());
		
	}
	
	public static TaxCalculator getCalculator(){
		return new TaxCalculator2019();
	}
	
}
