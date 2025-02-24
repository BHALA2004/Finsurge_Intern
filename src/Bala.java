interface Bala {
    static int n = 5;

    private static String meo(){
        return "hai";
    }
    public static String methog(){
        return meo();
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
        System.out.println();
        System.out.println(China.method());
    }
}
