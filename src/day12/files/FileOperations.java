package day12.files;

import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n--- File Operations ---");
        System.out.println("1. Write to File");
        System.out.println("2. Read File");
        System.out.println("3. Count Lines in File");
        System.out.println("4. Get File Size");
        System.out.println("5. Lock and Write to File");
        System.out.println("6. Delete Folder");
        System.out.println("7. Delete Folder and Its Files");
        System.out.println("8. Exit");
        while (true) {

            System.out.print("Enter Option: ");

            int input;
            try {
                input = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Enter Valid:");
                scanner.nextLine();
                continue;
            }

            switch (input) {
                case 1:
                    writeFile(scanner);
                    break;
                case 2:
                    readFile(scanner);
                    break;
                case 3:
                    countLines(scanner);
                    break;
                case 4:
                    getFileSize(scanner);
                    break;
                case 5:
                    lockAndWriteFile(scanner);
                    break;
                case 6:
                    deleteFolder(scanner);
                    break;
                case 7:
                    deleteFolderWithFiles(scanner);
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Invalid option,Enter Valid:");
            }
        }
    }


    public static void writeFile(Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            String input = scanner.nextLine();
            fileWriter.write(input + "\n");
            }

         catch (IOException e) {
            System.out.println("Error");
        }
    }


    public static void readFile(Scanner scanner) {
        System.out.print("Enter file name : ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }


    public static void countLines(Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        int count = 0;
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                count++;
                fileScanner.nextLine();
            }
            System.out.println("Total lines: " + count);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }


    public static void getFileSize(Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        System.out.printf("File size: %.5f MB%n", (double) file.length() / (1024 * 1024));
    }


   public static void lockAndWriteFile(Scanner scanner) {
        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("File does not exist!");
            return;
        }

        try (FileOutputStream fos = new FileOutputStream(file, true);
             FileChannel channel = fos.getChannel();
             FileLock lock = channel.tryLock()) {

            if (lock != null) {
                String input = scanner.nextLine();
                fos.write(input.getBytes());
                System.out.println("File is locked.");
            } else {
                System.out.println("File is locked by another process.");
            }
        } catch (IOException e) {
            System.out.println("Error handling file: " + e.getMessage());
        }
    }


    public static void deleteFolder(Scanner scanner) {
        System.out.print("Enter folder name: ");
        String folderName = scanner.nextLine();
        File folder = new File(folderName);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Folder does not exist!");
            return;
        }

        if (folder.delete()) {
            System.out.println("Folder deleted successfully.");
        }
    }


   public static void deleteFolderWithFiles(Scanner scanner) {
        System.out.print("Enter folder name: ");
        String folderName = scanner.nextLine();
        File folder = new File(folderName);

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Folder does not exist!");
            return;
        }

       for (File file : folder.listFiles()){
           file.delete();
       }
    }
}
