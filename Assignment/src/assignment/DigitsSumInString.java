package assignment;
import java.util.Scanner;

public class DigitsSumInString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,sum=0;
        String x = s.nextLine();
        s.close();

        for(i=0;i<x.length();i++){
            int c = x.charAt(i)-'0';             //to convert ascii values of numbers in character datatype to integer use   ----> -'0'

            if(c>=1 && c<=9){     // if(c>='1' && c<='9'){
                sum+=c;                 //sum+=c-'0';
            }                       //}
        }
        System.out.println(sum);


        // for string to int conversition 
        // String s1 ="5000";
        // String s2 ="6000";

        // int a = Integer.parseInt(s1);
        // int b = Integer.parseInt(s2);

        // System.out.println(a+b);

    }
}
