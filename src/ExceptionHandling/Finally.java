package ExceptionHandling;

public class Finally {
	public static void main(String[] args) {
		try {
			int a=5;
			int b=0;
			System.out.println(a/b);
		}
		finally {                                      // always executes whether exception works or not
			System.out.println("Finally Executed");
		}
	}
}
