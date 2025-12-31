package FileOperation;
import java.io.*;
public class WriteInFile {
	public static void main(String[] args) {
		try {
			File file=new File("/home/sms-enterprises/eclipse-workspace/JavaPracticeCode/src/FileOperation/Sample.txt");
			FileWriter writer=new FileWriter(file);
			writer.write("hellooo");
			writer.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
