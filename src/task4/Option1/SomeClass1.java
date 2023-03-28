package task4.Option1;

public class SomeClass1 {
    private final String name;

    public SomeClass1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void read() {
        System.out.println(getName() + ": read started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(getName() + ": read finished");
    }
}
