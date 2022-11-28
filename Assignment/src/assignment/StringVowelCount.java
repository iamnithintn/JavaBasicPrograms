package assignment;
import java.util.Scanner;

public class StringVowelCount {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        // while(true){
            System.out.println("Enter the string");
            String str = s.nextLine().toLowerCase();
            s.close();
            int a=0,e=0,i=0,o=0,u=0;

            for(int j=0;j<str.length();j++){
                char c = str.charAt(j);

                if(c=='a'){
                    a++;
                }
                if(c=='e'){
                    e++;
                }
                if(c=='i'){
                    i++;
                }
                if(c=='o'){
                    o++;
                }
                if(c=='u'){
                    u++;
                }
            }
            System.out.println("Total vowels : "+(a+e+i+o+u));

            // System.out.print("Continue? N for no, any key for yes : ");
            // char c = s.next().charAt(0);

            // if(c=='n'||c=='N'){
            //     break;
            // }
        // }

    }
}
