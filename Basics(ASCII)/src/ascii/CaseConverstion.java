package ascii;
import java.util.Scanner;

public class CaseConverstion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter the values in upper or lower cases : ");
            char c = s.next().charAt(0);

            if(c>'A' && c<'Z'){
                System.out.println("Lower Case of "+c+" : "+(char)(c+32));
            }
            else if (c>'a' && c< 'z'){
                System.out.println("Upper Case of "+c+" : "+(char)(c-32));
            }
            else{
                System.out.println("Invalid input");
            }
            System.out.print("Do you wish to continue? Y for yes, N for No : ");
            char d = s.next().charAt(0);
                if(d=='N' || d=='n'){
                    break;
                }
        }
        s.close();
    }
}
