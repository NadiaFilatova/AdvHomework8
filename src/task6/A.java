package task6;

public class A {
    synchronized void foo(B b) { //MainThread
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered A.foo");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("A Interrupted");
        }
        System.out.println(name + " trying to call B.last()");
        b.last();

    }

    public void last() {//MainThread

        System.out.println("Inside A.last");

    }

}

