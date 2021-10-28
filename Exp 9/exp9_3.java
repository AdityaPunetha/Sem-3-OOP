class thread {
    int counter;

    synchronized void test() {
        System.out.println(Thread.currentThread().getName() + " starts");
        counter++;
        System.out.println("Counter = " + counter);
        System.out.println(Thread.currentThread().getName() + " ends\n");
    }
}

public class exp9_3 {
    public static void main(String[] args) {
        int n = 10;
        thread d2 = new thread();
        Thread t2[] = new Thread[n];
        for (int i = 0; i < t2.length; i++) {
            t2[i] = new Thread() {
                public void run() {
                    d2.test();
                }
            };
            t2[i].setName("Thread " + (i + 1));
            t2[i].start();
        }
    }
}