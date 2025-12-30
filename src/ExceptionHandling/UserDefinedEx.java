package ExceptionHandling;

class CustomEx extends Exception {
	public CustomEx(String message) {
		super(message);
	}
}
class AgeValidator{
	static void Validator(int age)throws CustomEx {
		if(age<18) {
			throw new CustomEx("Invalid Age to Vote");
		}
		else {
			System.out.println("Good to go");
		}
	}
}

public class UserDefinedEx  {
	public static void main(String[] args){
		try{
			AgeValidator.Validator(19);
		}
		catch(CustomEx e){
			System.out.println(e.getMessage());
		}
	}
} 
