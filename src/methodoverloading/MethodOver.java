package methodoverloading;

public class MethodOver {
    static void main(String[] args) {
        Calculator c=new Calculator();

        System.out.println("methodoverloading in diff parameter");

        c.add(2,3);
        c.add(1,1,1);

        System.out.println("methodoverloading in diff data type");

        c.mul(10,10);
        c.mul("jainish","patel");


        System.out.println("methodoverloading in diff order");
        c.order(2.2,2);
        c.order(3,4.4444);

        System.out.println("methodoverloading with static keyword");
        Calculator.start(2);
        Calculator.start("example");
    }
}
