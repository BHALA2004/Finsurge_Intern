package Day7;

class DiffParameters{
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b){
        return a+b;
    }
}

class DiffReturnType{
    public static int multiply(int a,int c){
        return a*c;
    }
    public static float multiply(float a , float c){
        return a*c;
    }

    public static double multiply(double a , double c){
        return a*c;
    }
}

class ChangeInParametr{
    public static void print(int a ,String b){
        System.out.println(a+" "+b);
    }
    public static void print(String b ,int a ){
        System.out.println(b+" "+a);
    }
}

public class MathUsingMethodOverloading {
    public static void main(String[] args) {
        //Diff Parameters
        System.out.println(DiffParameters.add(3,6));
        System.out.println(DiffParameters.add(7.2,10.3));

        //Diff Return Type
        System.out.println(DiffReturnType.multiply(3,2));
        System.out.println(DiffReturnType.multiply((float) 7.2,(float)2.6));
        System.out.println(DiffReturnType.multiply(7.2,2.6));


        //ChangeInParameter
        ChangeInParametr.print(1,"hai");
        ChangeInParametr.print("Super",3);
    }
}
