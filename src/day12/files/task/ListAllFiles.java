package day12.files.task;

import java.io.File;
import java.util.Scanner;

public class ListAllFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Path: ");
        String path = scanner.next();
        File file = new File(path);

        if (file.exists() && file.isDirectory()) {
            listFilesRecursively(file, 0);
        } else {
            System.out.println("Path not found or is not a directory.");
        }
        scanner.close();
    }

    public static void listFilesRecursively(File directory, int level) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if(file.isDirectory()){
                    System.out.println("File = "+file.getName());
                }
                else {
                    System.out.println("Directory = "+file.getName());
                }
                if (file.isDirectory()) {
                    listFilesRecursively(file, level + 1);
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
