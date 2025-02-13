package Day7;

public class WrapperClassImplementation {
    public static void main(String[] args) {

        //used to convert primitive to non-primitive one
        //because collections may handle only the non-primitive data type only
        //builtin methods may also be used
        Integer m = 10;
        Integer x = 55;
        System.out.println(m.equals(x));

        System.out.println(m.toString());

    }
}
