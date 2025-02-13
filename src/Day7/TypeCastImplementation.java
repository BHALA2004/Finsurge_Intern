package Day7;

public class TypeCastImplementation {
    public static void main(String[] args) {

        //Widening Casting -> source - small,destination -> big (Automatically)
        int value = 5;
        double doubleValue  = value;

        System.out.println(value);
        System.out.println(doubleValue);

        //Narrowing Casting -> source - big,destination -> small (Manually)
        double doublecast = 10.321143343;
        int intCast = (int)doublecast;
        System.out.println(doublecast);
        System.out.println(intCast);

        float m = (float) 7.23;
        int c = (int) m;
        System.out.println(m);
        System.out.println(c);

        int res = 19;
        float resFloat = res;
        System.out.println(res);
        System.out.println(resFloat);


    }
}
