package Array;

public class OneDArray {
	public static void main(String[] args) {
		int[] marks= {42,88,67,56,43};
		for(int even:marks) {
			if(even%2==0) {
				System.out.println(even);
			}
		}
	}
}
