package strings;

import java.util.Scanner;

public class StringCamelConvention {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int i;
        s.close();
        String ref ="";
        // String word="";


        //work in progress

    //     for(i=0;i<st.length()-1;i++){
    //     char c =st.charAt(i);

    //     if(c==' '){
    //         char y = st.charAt(i+1);
    //         if(y>'a' && y<'z'){
    //             ref+=(char) (y-32);
    //         }
    //     }
    //     else if(c==' '){
    //         ref+='-';

    //     }
    //     else{
    //         ref+=c;
    //     }
    // }
    //     System.out.println(ref);


                    ///with array

    String [] words = st.split(" ");

        for (i=0;i<words.length;i++){
            if(words[i].charAt(0)>'a' && words[i].charAt(0)<'z'){
                ref+=(char)(words[i].charAt(0)-32);
                ref+=words[i].substring(1);
                if(i!=words.length-1){
                    ref+=" ";
                }
            }
        }
        System.out.println(ref);
    }
}
