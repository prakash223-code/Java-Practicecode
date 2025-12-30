package OOP;

class application {
    private String name;
    private int roll_no;

    //Getter
    public String getValues() {
    	return "Name: " + name + ", Roll No: " + roll_no;
    }

    //setter
    public void setValues(String str, int num) {
        name = str;
        roll_no = num;
    }
}

public class getter_setter {
    public static void main(String[] args) {
        application one = new application();
        one.setValues("ezio",38);
        System.out.println(one.getValues());

        application two = new application();
        two.setValues("Ash",3);
        System.out.println(two.getValues());
    }
}

