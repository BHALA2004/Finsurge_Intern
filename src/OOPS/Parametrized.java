package OOPS;

public abstract class Parametrized {
    Parametrized(int m){
        System.out.println("Hello"+m);
    }
    abstract void Hello();
}

class child extends Parametrized{
    child(){
        super(11);
    }
    void Hello(){
        System.out.println("hooo");
    }
}
class Maining {
    public static void main(String[] args) {
        child child = new child();
        child.Hello();
    }
}
