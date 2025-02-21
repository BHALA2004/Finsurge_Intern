package day12.files;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class Filing {
    public static void main(String[] args) {
        try {
            File file = new File("E:\\Finsurge\\Dude");
            for (File file1 : file.listFiles()){
                file1.delete();
            }


        }
        catch (Exception e){
            System.out.println("Fine");
        }
    }
}
