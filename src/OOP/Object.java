package OOP;

public class Object {
    static class application {
        String name;
        int rollno;

        void display() {
            System.out.println(name);
            System.out.println(rollno);
        }

        void SetValues(String str, int num) {
            name = str;
            rollno = num;
        }
    }

    public static void main(String[] args) {
        application one = new application();
        one.SetValues("ezio", 38);
        one.display();

    }
}
