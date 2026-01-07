package methodoverloading;

public class Calculator {

    void add(int a,int b){
        int result=a+b;
        System.out.println(result);
    }

    void add(int a,int b,int c){
        int ans=a+b+c;
        System.out.println(ans);
    }


    void mul(int a , int b){
        System.out.println(a+b);
    }

    void mul(String d,String v){
        System.out.println(d+v);
    }

    void order(int a,double b){
        System.out.println(a+ " " +b);
    }

    void order(double b,int a){
        System.out.println(b+ " " +a);
    }

    static void start(int a){
        System.out.println("static MO " +a);
    }

    static void start(String b){
        System.out.println("static MO"+b);
    }

}


