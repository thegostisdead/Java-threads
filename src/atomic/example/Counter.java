package atomic.example;


import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    private AtomicInteger count = new AtomicInteger(0);


    public void inc() {
        this.count.incrementAndGet();
    }

    @Override
    public String toString() {
        return "CounterLock{" +
                "count=" + count +
                '}';
    }

}
