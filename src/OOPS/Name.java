package OOPS;

public interface Name {
    static int name(int k){
        return k;
    }
    default void maining(){
        System.out.println("Hai");
    }
    void show();
}
class Naming implements Name{
    @Override
    public void maining(){
        System.out.println("Mainn");
    }

    public void show(){
        System.out.println("Hello");
    }
}
class Main{
    public static void main(String[] args) {
        Name m = new Naming();
        m.maining();
        System.out.println(Name.name(3));
    }
}
