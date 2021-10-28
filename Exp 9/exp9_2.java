class even extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                System.out.println("Even : " + i);
        }
    }
}

class odd extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                System.out.println("Odd : " + i);
        }
    }
}

class exp9_2 {
    public static void main(String[] args) {
        even evenThread = new even();
        odd oddThread = new odd();
        evenThread.start();
        oddThread.start();
    }
}