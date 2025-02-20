package day12.files;

import java.io.File;

public class FileBasics {
    public static void main(String[] args) {
        try {
            File file = new File("dude");
            file.delete();
            System.out.println("deleted");
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
