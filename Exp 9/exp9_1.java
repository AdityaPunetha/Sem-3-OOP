
public class exp9_1 extends Thread {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        exp9_1 t = new exp9_1();
        t.start();
    }
}