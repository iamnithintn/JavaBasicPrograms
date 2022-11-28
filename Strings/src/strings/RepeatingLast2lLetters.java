package strings;

import java.util.Scanner;

public class RepeatingLast2lLetters {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String st = s.nextLine();
        s.close();
        // String ans = "";
        // int len = st.length();

        // char l1 = st.charAt(len-2);
        // char l2 = st.charAt(len-1);
        // ans += l1;
        // ans+=l2;

        // System.out.println(ans);

                        //using substring

        String end = st.substring(st.length()-2);
        System.out.println(end);

        
    }


    
}
