package strings;
import java.util.Scanner;
public class StringUpperLower {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s = sn.nextLine();
        int i;
        sn.close();
                     //without arrays 
       
 
        // for(i=0;i<s.length();i++){
        //     char c =s.charAt(i);            //accessing each variables individually
        //     if (c>'a' && c<'z'){
        //         char y = (char) (c-32);
        //         System.out.print(y);
        //     }
        //     else if(c>'A' && c< 'Z'){
        //         char y=  (char) (c+32);
        //         System.out.print(y);

        //     }
        // }

                    //Array Method

        char [] c = s.toCharArray();       //converting String to char and storing into an array

        for(i=0;i<s.length();i++){
            if(c[i]>'A' && c[i]<'Z'){
                c[i]= (char)(c[i]+32);
                // System.out.print(c[i]);;
            }
            else if(c[i]>'a' && c[i]<'z'){
                c[i]= (char)(c[i]-32);
                // System.out.print(c[i]);
            }
        }

        for(char j: c){                          //array traversal
            System.out.print(j);
        }
        
    
       

    }   
}



