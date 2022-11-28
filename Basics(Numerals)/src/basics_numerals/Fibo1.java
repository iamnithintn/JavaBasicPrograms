package basics_numerals;
import java.util.Scanner;

public class Fibo1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,n,a=0,b=1,c;
        n=s.nextInt();
        s.close();

        for(i=1; i<=n; i++){
            // if (n==0){
            //     System.out.println(n);
            // }
            // else if(n==1){
            //     System.out.println(1);
            // }
            // else{
                c=a+b;
                // System.out.println(0);
                // System.out.println(1);
                System.out.println(c);
                a=b;
                b=c;
            // }
        }
    }
}
