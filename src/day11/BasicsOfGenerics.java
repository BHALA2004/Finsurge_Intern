package day11;

import java.util.ArrayList;

public class BasicsOfGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // No type safety
        list.add("Hai");
        list.add(20); // No compile-time error
        String str = (String) list.get(0); // Explicit type casting required
        System.out.println(list);
    }
}
