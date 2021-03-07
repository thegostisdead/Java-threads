package threadclass.example;

public class Main {

    public static void main(String[] args) {

        Counter c = new Counter();

        WorkerThread t1 = new WorkerThread(c);
        WorkerThread t2 = new WorkerThread(c);

        t1.run();
        t2.run();

        System.out.println(c.toString());

    }
}
