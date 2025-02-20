package day11;

class Utility {
    public static <T> void printArray(T[] arr,int m) {
        for (T item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}

public class GenericMethodExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Hello", "Generics", "Java"};

        Utility.printArray(intArray,2);  // Output: 1 2 3 4 5
        Utility.printArray(strArray,2);  // Output: Hello Generics Java
    }
}

