package assignment;
import java.util.Scanner;

public class StringPalindrome{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        // while(true){
            System.out.print("Enter the string : ");
            String str = s.nextLine().toLowerCase();
            // System.out.println(str);

            String s1 = "";
            int i;
            s.close();


            for(i=str.length()-1;i>=0;i--){
                s1+=str.charAt(i);
            }
            // System.out.println(s1);

            System.out.println((str.equals(s1))? "Palindrome":"Not a Palindrome");

        // System.out.print("Do you wish to continue? Y for yes, N for No : ");
        // char d = s.next().charAt(0);
        //     if(d=='N' || d=='n'){
        //         break;
        //     }
        // }
    }
}