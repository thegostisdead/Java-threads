package insidethread.example;

import java.util.ArrayList;
import java.util.List;

public class Enumeration extends Thread {

    private ArrayList<Integer> list;
    private int x, y = 0;

    public Enumeration(List<Integer> list) {
        this.list = new ArrayList<>(list);
    }

    public synchronized void incX() {
        this.x++;
    }

    public synchronized void incY() {
        this.y++;
    }

    @Override
    public String toString() {
        return "Enumeration{" +
                "list=" + list +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void run() {

        try {
            for (Integer a : this.list) {
                if (a <= 0) {
                    this.incX();
                } else {
                    this.incY();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
