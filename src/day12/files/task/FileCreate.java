package day12.files.task;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\Finsurge\\Dude");
        if(file.mkdir() || file.exists()){
            try {
                if(file.isDirectory()){
                    for (int i = 0;i<5;i++){
                        File file1 = new File(file,"file"+i);
                        if(file1.createNewFile()){
                            System.out.println("File created");
                        }
                    }
                }
            }
            catch (Exception e){
                System.out.println("error");
            }
        }


    }
}
