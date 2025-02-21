package OOPS;

public interface variables {
    static int k = 5;
}
class childing implements variables{
    void soo(){

        System.out.println(variables.k);
    }
}
class Maining1{
    public static void main(String[] args) {
        childing childing = new childing();
        childing.soo();
    }
}
