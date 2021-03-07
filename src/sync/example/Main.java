package sync.example;

public class Main {


    public static void main(String[] args) throws Exception{

        // https://www.youtube.com/watch?v=RH7G-N2pa8M

        Counter c = new Counter();



        Thread t1 = new Thread(new Runnable() {

            public void run() {

                for (int i = 0; i < 1000 ; i++) {
                    c.inc();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {

                for (int i = 0; i < 1000 ; i++) {
                    c.inc();
                }

            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c);


    }

}
