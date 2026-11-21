package singleton;

public class Main {
    public static void main() {
        Thread t1 = new Thread(() ->
        {
            Calculator.getInstance();
        });

        Thread t2 = new Thread(() ->
        {
            Calculator.getInstance();
        });

        t1.start();
        t2.start();
    }
}
