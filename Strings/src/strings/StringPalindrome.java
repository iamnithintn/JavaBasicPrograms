package strings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String lower = st.toLowerCase();
        String ref = lower;
        s.close();
        int i;

                  //without array
        String rev ="";
        for(i=lower.length()-1;i>=0;i--){
            char c = lower.charAt(i);
            rev+=c;
        }
        if (ref.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }
}
