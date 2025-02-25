package day14.thread;

class MatrixMultiplyThread extends Thread{
    int i;
    int j;
    int[][] arr1 ;
    int[][] arr2;
    int[][] arr3;

    public MatrixMultiplyThread(int row,int col,int[][] arr1,int[][] arr2,int[][] arr3){
        this.i=row;
        this.j = col;
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.arr3 = arr3;
    }

    public void run(){
        arr3[i][j]=0;
        for (int k = 0; k < arr1[0].length; k++) {
            arr3[i][j]+=arr1[i][k]*arr2[k][j];
        }
    }

}
public class MatrixMultiplicationUsingThread {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = {{1,2,3},{4,5,6},{7,8,9}};

        Thread[][] threads = new Thread[arr1.length][arr1[0].length];
        int row = arr1.length;
        int column  = arr1[0].length;
        int[][] result = new int[row][column];
        for (int i = 0;i<row;i++){
            for (int j = 0; j < column; j++) {
                threads[i][j]=new MatrixMultiplyThread(i,j,arr1,arr2,result);
                threads[i][j].start();
            }
            //System.out.println();
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    System.out.println("Interruption");
                }
            }
        }

        for(int i = 0;i<result.length;i++){
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }


    }
}
