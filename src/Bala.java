interface Bala {
    public static String methog(){
        return "Hai";
    }
}
interface China{
    public static String method(){
        return "joy";
    }
}
class Main implements Bala,China{
    public static void main(String[] args) {
        System.out.println(Bala.methog());
        System.out.println(China.method());
    }
}
