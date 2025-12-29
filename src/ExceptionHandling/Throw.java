package ExceptionHandling;
class age{
	static void check(int age){
		if(age<18) {
			throw new ArithmeticException("Invalid Age");
		}
		else {
			System.out.println("Good To Go");
		}
	}
}
public class Throw {
	public static void main(String[] args) {
		try {
			age.check(18);
		}
		catch(Exception E){
			System.out.println(E.getMessage());
		}
		
	}
}
