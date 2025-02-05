//Class name
public class NamingConventions {
    public static void printFunction(String personName){

        //constant variable name
        final int PERSON_ID = 5;
        System.out.println(PERSON_ID+" "+personName);
    }
    public static void main(String[] args) {

        //variable name
        String personName = "Bala";

        //method Name
        printFunction(personName);
        System.out.println(args.length);
        for (String s : args){
            System.out.println(s.toString());
        }

    }


}
