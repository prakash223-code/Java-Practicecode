package OOP;

class Father{
    int Asset=10000000;
    public int share(){
        return Asset/2;
    }
}
class Son extends Father{
    void AssetShare(){
      System.out.println("Son's Share is: "+share());
    }
}
class Daughter extends Father{
    void AssetShare(){
      System.out.println("Daughter's Share is: "+share());
    }
}
class HierarchicalInheritance{
    public static void main(String[] args) {
        Son son=new Son();
        son.AssetShare();
        
        Daughter daughter=new Daughter();
        daughter.AssetShare();
    }
}
