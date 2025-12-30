package OOP;

public class Recursive{
    public static void natural(int n) {
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            natural(n-1);
        }
    }

    public static void main(String[] args) {
        natural(10);
    }
}
