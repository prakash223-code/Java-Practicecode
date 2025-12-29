package OOP;

abstract class Mobile{
    abstract void power();
}
class IQOO extends Mobile{
    void power(){
        System.out.println("IQOO is Turning on");
    }
}
class Samsung extends Mobile{
    void power(){
        System.out.println("Samsung is Turning on");
    }
}
class AbsractClassAndMethod{
    public static void main(String[] args) {
        IQOO iqoo=new IQOO();
        iqoo.power();
        
        Samsung samsung=new Samsung();
        samsung.power();
    }
}
