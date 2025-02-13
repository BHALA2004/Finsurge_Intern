package Day7;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {

        //Boxing -> convert primitive to wrapper (manually)
        int n = 5;
        Integer n1 = Integer.valueOf(n);
        System.out.println(n1);

        //AutoBoxing -> convert primitve to wrapper (Implicitly)
        int n2 = 5;
        Integer n3 = n2;
        System.out.println(n3);

        //UnBoxing -> convert Wrapper to primitive (Manually)
        Integer n4  = 5;
        n4.intValue();
        System.out.println(n4);

        //AutoUnBoxing -> convert Wrapper to primitive (Implicitly)
        Integer n5 = 10;
        int k = n5;
        System.out.println(n5);

    }
}
