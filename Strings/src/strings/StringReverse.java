package strings;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int i;
        s.close();

                  //without array
        String rev ="";
        for(i=st.length()-1;i>=0;i--){
            char c = st.charAt(i);
            rev+=c;
        }
        System.out.println(rev);
    }
}
