public class exp9_1_1 implements Runnable {
    public void run() {
        System.out.println("runnable");
    }

    public static void main(String[] args) {
        exp9_1_1 t = new exp9_1_1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}