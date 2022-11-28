package regEx;

import java.util.Scanner;
import java.util.regex.*;

public class StringStartsWith {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){

            System.out.print("Enter the String : " );
            String str = s.nextLine();
            // System.out.print("Enter the Character : " );
            // char c = s.nextLine().charAt(0);
            

            Pattern p = Pattern.compile("[A,a].*");                  //how to take custom user ip
            Matcher m = p.matcher(str);
            boolean ans = m.matches();

            System.out.println(ans);


            System.out.print("Do you wish to continue? Y for yes, N for No : ");
            char d = s.next().charAt(0);
                if(d=='N' || d=='n'){
                    break;
                }
        }
        s.close();
    }
}
