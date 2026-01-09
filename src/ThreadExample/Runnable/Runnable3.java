package ThreadExample.Runnable;

 class Runnable3 implements Runnable {
     public void run() {
         for(int i = 1; i <= 5; i++) {
             System.out.println("Child Thread: " + i);
         }
     }

     public static void main(String[] args) {

         Runnable3 task = new Runnable3();
         Thread t = new Thread(task);
         t.start();

         for(int i = 1; i <= 5; i++) {
             System.out.println("Main Thread: " + i);
         }
     }

}
