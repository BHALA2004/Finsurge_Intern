package day12.files.task;

import java.io.File;
import java.util.Scanner;

public class ListAllFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Path: ");
        String path = scanner.next();
        File file = new File(path);

        System.out.println("1.Print Both File and Directory\n2.Print File Only\n3.Print Directory Only\n4.Print PDF Formated File\n5.Print WORD Formated File\n6.Exit");

        if (file.exists() && file.isDirectory()) {
            int option;
            while (true){
                System.out.println();
                System.err.println("Enter Option :");
                while (true){
                    try {
                        option = scanner.nextInt();
                        if(option>=1 && option<=6){
                            break;
                        }
                        else {
                            System.out.println("Invalid,Enter Valid:");
                        }
                    }
                    catch (Exception e){
                        System.out.println("Error Occured,Enter Valid:");
                        scanner.next();
                    }
                }
                switch (option){
                    case 1:
                        listFilesRecursivelyForFileAndDirectory(file,0);
                        break;
                    case 2:
                        listFilesRecursivelyForFile(file,0);
                        break;
                    case 3:
                        listFilesRecursivelyForDiectory(file,0);
                        break;
                    case 4:
                        listFilesRecursivelyForPDF(file,0);
                        if(i==0){
                            System.out.println("No Pdf Found");
                        }
                        break;
                    case 5:
                        listFilesRecursivelyForWord(file,0);
                        if(j==0){
                            System.out.println("No Word is Found");
                        }
                        break;
                    case 6:
                        System.exit(0);
                    case 7:
                        System.out.println("Enter Valid : ");
                        break;
                }
            }


        } else {
            System.err.println("Result = Path not found or is not a directory.");
        }
        scanner.close();
    }

    public static void listFilesRecursivelyForFileAndDirectory(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.isDirectory()){
                    System.out.println("File = "+file.getName());
                }
                else {
                    System.out.println("    Directory = "+file.getName());
                }
                if (file.isDirectory()) {
                    listFilesRecursivelyForFileAndDirectory(file, level + 1);
                }
            }
        }
    }

    public static void listFilesRecursivelyForDiectory(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.isDirectory()){
                    System.out.println("File = "+file.getName());
                }
                if (file.isDirectory()) {
                    listFilesRecursivelyForDiectory(file, level + 1);
                }
            }
        }
    }

    public static void listFilesRecursivelyForFile(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.isFile()){
                    System.out.println("File = "+file.getName());
                }
                if (file.isDirectory()) {
                    listFilesRecursivelyForFile(file, level + 1);
                }
            }
        }
    }
    static int i = 0;
    public static void listFilesRecursivelyForPDF(File directory, int level) {
        File[] files = directory.listFiles();boolean flag = true;
        if (files != null) {
            for (File file : files) {
                if(file.isFile() && file.getName().toLowerCase().endsWith(".pdf")){
                    System.out.println("File = "+file.getName());
                    i++;
                }
                if (file.isDirectory()) {
                    listFilesRecursivelyForPDF(file,level+1);
                }
            }
        }
    }

    static int j = 0;

    public static void listFilesRecursivelyForWord(File directory, int level) {
        File[] files = directory.listFiles();boolean flag = true;
        if (files != null) {
            for (File file : files) {
                if(file.isFile() && file.getName().toLowerCase().endsWith(".docx")){
                    System.out.println("File = "+file.getName());
                    flag = false;
                    j++;
                }
                if (file.isDirectory()) {
                    listFilesRecursivelyForWord(file, level + 1);
                }
            }
        }

    }



//    private static void printIndented(File file, int level) {
//        String indent = "  ".repeat(level);
//        if (file.isDirectory()) {
//            System.out.println(indent + "[Dir] " + file.getName());
//        } else {
//            System.out.println(indent + "  ├─ " + file.getName());
//        }
//    }
}
