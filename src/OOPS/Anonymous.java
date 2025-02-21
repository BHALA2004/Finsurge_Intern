package OOPS;

public class Anonymous {
    public Anonymous(int k){
        {
            System.out.println("Hai");
        }
        System.out.println(k);
    }
    public static void main(String[] args) {
        new Anonymous(5);
        Thread t = new Thread(new Runnable() {

            public void run()
            {
                System.out.println("Child Thread");
            }
        });

        t.start();

        System.out.println("Main Thread");
    }

        }


