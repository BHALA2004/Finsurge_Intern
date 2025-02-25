package day14.thread;

import java.util.Scanner;

class MatrixMultiplicationRunnable implements Runnable {
    int i;
    int j;
    int[][] arr1;
    int[][] arr2;
    int[][] arr3;

    public MatrixMultiplicationRunnable(int row, int col, int[][] arr1, int[][] arr2, int[][] arr3) {
        this.i = row;
        this.j = col;
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
    }

    @Override
    public void run() {
        arr3[i][j] = 0;
        for (int k = 0; k < arr1[0].length; k++) {
            arr3[i][j] += arr1[i][k] * arr2[k][j];
        }
    }
}

public class MatrixMultiplicationUsingRunnable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = scanner.nextInt();

        int[][] arr1 = new int[row][column];

        System.out.print("Enter the number of rows: ");
        int row1 = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int column1 = scanner.nextInt();
        int[][] arr2 = new int[row1][column1];

        if(arr1[0].length!=arr2.length){
            System.exit(0);
        }
        else {
            int[][] result = new int[row][column1];

            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    arr2[i][j] = scanner.nextInt();
                }
            }

            Thread[][] threads = new Thread[row][column1];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column1; j++) {
                    MatrixMultiplicationRunnable matrixMultiplicationRunnable = new MatrixMultiplicationRunnable(i, j, arr1, arr2, result);
                    threads[i][j] = new Thread(matrixMultiplicationRunnable);
                    threads[i][j].start();
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column1; j++) {
                    try {
                        threads[i][j].join();
                    } catch (InterruptedException e) {
                        System.out.println("Interruption");
                    }
                }
            }


            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }



    }
}