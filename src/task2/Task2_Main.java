package task2;

public class Task2_Main {
    public static void main(String[] args) {
        Task2 task2First = new Task2("First");
        Task2 task2Second = new Task2("Second");
        Task2 task2Third = new Task2("Third");
        task2First.start();
        task2Second.start();
        task2Third.start();
    }
}
