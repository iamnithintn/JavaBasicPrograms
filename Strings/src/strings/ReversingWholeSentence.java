package strings;

import java.util.Scanner;
// import java.lang.StringBuffer;

public class ReversingWholeSentence {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int i;
        s.close();
        String ref ="";

                        //without array//normal revrse string method

        for(i=st.length()-1;i>=0;i--){
            char c = st.charAt(i);
            if(c==' '){
                ref+=' ';
            }
            else{
                ref+=c;
            }

        }
        System.out.println(ref);

                    //with array

        // String [] words = st.split(" ");
        //int j;
        // for(i=words.length-1;i>=0;i--){
        //     String w =" "+words[i];
        //     for(j=w.length()-1;j>=0;j--){
        //         char c = w.charAt(j);
        //             ref+=c;
        //         }
        //     }
        // System.out.println(ref);

                 //StringBuffer//Directly

        // StringBuffer Sb = new StringBuffer();

        // char reverse =new StringBuffer(st).reverse();
    }
}
