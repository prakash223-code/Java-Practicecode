package OOP;
class watch{
	String name="titan";
	void display(){
		System.out.println(name);
	}
}
class rolex extends watch{
	String name="rolex";
	void print() {
		System.out.println(name);
	}
}
public class SingleInheritance {
	public static void main(String[] args) {
		rolex obj=new rolex();
		obj.display();
		obj.print();	
	}
}
