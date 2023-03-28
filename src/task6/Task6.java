package task6;
//Змінити завдання №5.
// Усі можливі способи (які Ви знаєте) вирішити проблему взаємного блокування.

public class Task6 implements Runnable {
    A a = new A();
    B b = new B();

    Task6() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, " RacingThread");
        t.start();

        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        try {
            b.bar(a); // get lock on b in other thread.
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Task6();
    }
}
