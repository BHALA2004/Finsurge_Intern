import java.io.File;

public class FolderCreate {
    public static void main(String[] args) {
        File file = new File("New Folder");
        if(file.mkdir()){
            System.out.println("Directory Make");
        }
    }
}
