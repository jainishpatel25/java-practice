package ThreadExample.ThreadClass;

 class SimpleThread extends Thread{

    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();
        t.start();   // starts new thread

    }
}
