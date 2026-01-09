package ThreadExample.ThreadClass;

class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 3; i++) {
            System.out.println("Child Thread: " + i);
//            Thread.yield();
//            try {
//                Thread.sleep(4000);                  // currently running thread pause for a specified time.
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }

    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();

//        t.join();     //let finish to other thread first


        for(int i = 1; i <= 3; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}
