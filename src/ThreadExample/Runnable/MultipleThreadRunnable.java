package ThreadExample.Runnable;


class MultipleThreadRunnable implements Runnable {

    public void run() {
        System.out.println(
                Thread.currentThread().getName() + " is running"
        );
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultipleThreadRunnable());
        Thread t2 = new Thread(new MultipleThreadRunnable());

        t1.start();
        t2.start();
    }
}
