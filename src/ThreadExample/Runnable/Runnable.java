package ThreadExample.Runnable;

class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread is running using Runnable");
    }

    public static void main(String[] args) {
        MyTask task = new MyTask();         //normal object
        Thread t = new Thread(task);        //thread object
        t.start();
    }
}

