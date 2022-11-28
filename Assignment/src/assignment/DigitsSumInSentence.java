package assignment;
import java.util.Scanner;

public class DigitsSumInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i,sum=0;
        String [] s = str.split(" ");
        sc.close();

        for(i=0;i<s.length;i++){
            char c = s[i].charAt(0);
            if(c>'0' && c<'9'){
                int x = Integer.parseInt(s[i]);
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}