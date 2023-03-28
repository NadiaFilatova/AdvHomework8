package task4.Option2;

public class Option2Main {
    public static void main(String[] args) {
        Test t = new Test("initial string");
        A a1 = new A(t);
        A a2 = new A(t);
        new Thread(a1, "thread 1").start();
        new Thread(a2, "thread 2").start();
    }
}
