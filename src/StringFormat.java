import java.lang.*;
public class StringFormat {
    public static void main(String[] args) {

        //Formatting the string
        String string = "Bala %s %.2f";
        System.out.println(String.format(string,"BAla",70.1232));



            //Illegal format Exception
            System.out.println(String.format(string, 23, "Bala"));

            //Missing Arguments Exception
            System.out.println(String.format(string, 731));

    }
}
