package threadclass.example;

public class WorkerThread implements Runnable {

    private Counter c ;

    public WorkerThread(Counter counter) {
        this.c = counter;
    }

    public  void run() {


        for (int i = 0; i < 1000; i++) {
            try {

                c.inc();
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
