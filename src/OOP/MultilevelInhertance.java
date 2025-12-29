package OOP;

class GrandFather{
    String gender="Male";
    
    void print(){
        System.out.println(gender);
    }
}
class Mom extends GrandFather{
     String gender="Female";
}
class Daught extends Mom{
    void display(){
        System.out.println(gender);
    }
}
class MultilevelInheritance {
    public static void main(String[] args) {
      Daught child=new Daught();
      child.display();
    }
}
