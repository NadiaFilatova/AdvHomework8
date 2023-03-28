package task2;

//Затримка потоку. Необхідно створити три потоки, кожних із цих потоків запустити (наприклад: main, second, first),
// і коли ці потоки успішно відпрацюють – вивести на екран повідомлення (завершення потім first, second і main).
public class Task2 extends Thread {
    public Task2(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(" Thread start " + getName());
        System.out.println("Thread finish " + getName());
    }
}
