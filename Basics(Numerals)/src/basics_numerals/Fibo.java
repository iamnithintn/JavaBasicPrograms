package basics_numerals;
import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=-1,b=1,c,n,i;
        System.out.print("Enter N : "); 
        n = s.nextInt();
        s.close();
        for (i=1; i<=n; i++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }

    }
}
