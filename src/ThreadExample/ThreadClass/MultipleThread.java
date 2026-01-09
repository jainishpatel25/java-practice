package ThreadExample.ThreadClass;
class MultipleThread extends Thread{


    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(
                    Thread.currentThread().getName() + " : " + i
            );
        }
    }

    static void main(String[] args) {
        MultipleThread m=new MultipleThread();
        MultipleThread m1=new MultipleThread();

        m.start();
        m1.start();
    }
}
