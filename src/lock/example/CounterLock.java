package lock.example;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterLock {

    private Integer count = 0;

    private Lock lock = new ReentrantLock();

    public void inc() {
        try {
            lock.lock();
            this.count++;

        } catch (Exception e ) {
            e.printStackTrace();
        }
        finally {
            lock.unlock();
        }
    }

    @Override
    public String toString() {
        return "CounterLock{" +
                "count=" + count +
                '}';
    }
}
