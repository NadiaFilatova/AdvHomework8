package task4.Option2;

import java.util.Random;

public class A implements Runnable {
    private final Test test;

    public A(Test test) {
        this.test = test;
    }

    @Override
    public void run() {
        synchronized (test) {
            System.out.println("A[" + hashCode() + "]: current string value - " + test.getString());
            test.setString(new Random().nextInt() + "");
            System.out.println("A: new string value - " + test.getString());
        }
    }
}
