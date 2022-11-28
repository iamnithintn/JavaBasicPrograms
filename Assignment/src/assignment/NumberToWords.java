package assignment;
public class NumberToWords {
    public static void main(String[] args) {
        int n = 4503;
        
        String [] a ={"zero","one","two","three","four","five","six","seven","eight","nine"};
        String s="";

        int rem=0;
        while(n!=0){
            rem=n%10;
            s=a[rem]+s;                               //reverseing right here
            n=n/10;
        }
        System.out.println(s);
    }
}
