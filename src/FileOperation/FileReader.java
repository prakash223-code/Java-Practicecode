package FileOperation;
import java.util.*;
import java.io.*;
public class FileReader {
	public static void main(String[] args) {
		try {
			File f=new File("/home/sms-enterprises/eclipse-workspace/JavaPracticeCode/src/FileOperation/Sample.txt");
			Scanner read=new Scanner(f);
			while (read.hasNextLine()) {
				System.out.println(read.nextLine());
				
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
