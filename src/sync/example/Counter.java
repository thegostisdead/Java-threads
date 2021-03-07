package sync.example;

public class Counter {

    private Integer x = 0 ;

    public Counter() {

    }

    public synchronized void inc () {
        this.x++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "x=" + x +
                '}';
    }
}
