package ThreadExample.ThreadClass;

 class SimpleThread extends Thread{

    public void run() {
        System.out.println("Priority: " + getPriority());
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        SimpleThread t = new SimpleThread();

//        System.out.println(t.getName());
//        t.setName("Main-Thread");
//        System.out.println(t.getName());
        t.setPriority(10);
        t.start();   // starts new thread

    }
}
