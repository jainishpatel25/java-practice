package arrayexample;

public class Max {
    static void main(String[] args) {
        int [] a={22,45,34,64,29,10};
        int i;
        int j;
        int max = a[0];
        for(i=0;i<a.length;i++){
//            for(j=i+1;j<a.length;j++){
                if(a[i]>max){
                    max=a[i];
                }
//            }
        }
        System.out.println("Maximum number: " +max);
        
    }
}
