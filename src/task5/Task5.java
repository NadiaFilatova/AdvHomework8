package task5;

//Створити 2 класи. Реалізувати взаємне блокування цих класів.
//Кожен потік заснув, чекаючи на звільнення так необхідного монітора, іншим потоком.
// Але перший потік тримає захопленим монітор об'єкта a, очікуючи на звільнення монітора об'єкта b,
// а другий потік, тримає в захопленні монітор об'єкта b, очікуючи на звільнення монітора об'єкта a.

public class Task5 implements Runnable {
    A a = new A();
    B b = new B();

    Task5() {
        Thread.currentThread().setName("MainThread");
        Thread t = new Thread(this, "RacingThread");
        t.start();

        a.foo(b); // get lock on a in this thread.
        System.out.println("Back in main thread");
    }

    public void run() {
        b.bar(a); // get lock on b in other thread.
        System.out.println("Back in other thread");
    }

    public static void main(String[] args) {
        new Task5();
    }

}
