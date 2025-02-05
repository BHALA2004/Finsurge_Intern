
public class OperatorPrecedence {
    public static void main(String[] args) {

        int temporaryValue = (4/1)*3;
        System.out.println(temporaryValue);

        int resultValue = (2+4-1)/2*3; //first Brackets then left to right Associativity
        System.out.println(resultValue);

        System.out.println( 2<=4 && 4<=2 || 5>=2); // left to right for Gates and relational opertaor

        System.out.println(2!=2 && 1==1); // left to right

        System.out.println(5>2 ? true : false); //ternary operator

    }
}
