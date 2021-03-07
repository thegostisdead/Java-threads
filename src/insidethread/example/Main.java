package insidethread.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception{

        Enumeration a = new Enumeration(Arrays.asList(1,2,3,4,5,6,7,8,9,10,-5,-6));

        a.start();

        a.join();

        System.out.println(a.toString());


    }
}
