package assignment;
import java.util.Scanner;

public class StringWeirdReverse {
    public static void main(String[] args) {
        Scanner si = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = si.nextLine();
        int i,j;
        String s1="";
        si.close();


        String [] str = s.split(" ");

        for(i=0;i<str.length;i++){
            // System.out.println(str[i]+" ");
            if(i%2==0){
                char [] c = str[i].toCharArray();
                // System.out.println(c);
                for(j=c.length-1;j>=0;j--){
                    s1+=c[j];
                }
                s1+=" ";
            }
            else{
                s1+=str[i]+" ";
            }

        }
        System.out.println(s1);
    }
}
