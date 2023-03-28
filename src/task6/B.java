package task6;

public class B {
    synchronized void bar(A a) throws InterruptedException { //RacingThread
        String name = Thread.currentThread().getName();
        System.out.println(name + " entered B.bar");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("B Interrupted");
        }
        System.out.println(name + " trying to call A.last()");
        a.last();
    }

    public void last() { //RacingThread
        System.out.println("Inside A.last");

    }
}