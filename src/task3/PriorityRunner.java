package task3;

////Демонстрація пріоритетів. Створити 2 класи PriorityRunner та PriorityThread.
//// Запустити 3 потоки із пріоритетами (min, max, norm).
//// За допомогою циклу for виведемо на екран значення від 1 до 50 і вкажемо, який саме потік цю операцію робить.
public class PriorityRunner {
    public static void main(String[] args) {
        PriorityThread name1 = new PriorityThread("min");
        PriorityThread name2 = new PriorityThread("max");
        PriorityThread name3 = new PriorityThread("norm");
        name1.setPriority(Thread.MIN_PRIORITY);
        name2.setPriority(Thread.MAX_PRIORITY);
        name3.setPriority(Thread.NORM_PRIORITY);
        name1.start();
        name2.start();
        name3.start();
    }
}
