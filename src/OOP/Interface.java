package OOP;

interface Fathe{
    abstract void Gender();
}
interface Mother{
    abstract void Gender();
}
class SON implements Fathe,Mother{
    public void Gender(){
        System.out.println("Male");
    }
}
class Daughte implements Fathe,Mother{
    public void Gender(){
        System.out.println("Female");
    }
}
class Interface{
    public static void main(String[] args) {
        SON son=new SON();
        son.Gender();
        
        Daughte daughter=new Daughte();
        daughter.Gender();
    }
}

