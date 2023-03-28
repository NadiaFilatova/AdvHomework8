package task4.Option1;

public class SomeClass2 {
    private final int age;

    public SomeClass2(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public synchronized void test() {
        System.out.println(getAge() + ": test started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getAge() + ": test finished");
    }
}
