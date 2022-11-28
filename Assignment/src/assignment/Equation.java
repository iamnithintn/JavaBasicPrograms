package assignment;
import java.util.Scanner;

public class Equation {

    static int  equ(int a,int b){
        return (a*a+b*b+2*a*b);
    }

    public static void main(String[] args) {
        int a,b;

        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        int x = a*a+b*b+2*a*b;
        System.out.println(x);
        System.out.println(a*a+b*b+2*a*b);
        s.close();
        System.out.println(equ(a, b));
        
    }
}
