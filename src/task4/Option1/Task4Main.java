package task4.Option1;

//Створити 2 довільні класи з полями та методами. Необхідно синхронізувати методи цих класів між собою, тобто.
// щоб виводило на екран значення один за одним (1 клас, 2 клас, 1, 2 тощо).

// rework
public class Task4Main {
    public static void main(String[] args) {
        SomeClass1 someClass1 = new SomeClass1("some name");
        SomeClass2 someClass2 = new SomeClass2(100);

        Runnable r1 = someClass1::read;
        Runnable r2 = someClass2::test;
        new Thread(r1).start();
        new Thread(r2).start();

    }
}




