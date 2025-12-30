package ExceptionHandling;

public class TryCatch {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;

			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Divided by zero is undefined");
		}
		System.out.println("<--Program Ends-->");
	}
}
