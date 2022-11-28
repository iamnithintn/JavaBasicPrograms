package basics_numerals;
import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,n,ref=0,temp=1;
        System.out.print("Enter the Number");
        n = s.nextInt();
        s.close();
        for (i=1; i<=n; i++){
            ref=(temp*2)+1;
            temp=ref;
            System.out.println(temp);
        }

    }
}
