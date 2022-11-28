package ascii;
import java.util.Scanner;

class AsciiValues{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter the char your want to find the value of : ");

            char c = s.next().charAt(0);

            if (c>'A' && c<'Z'){
                System.out.println((int)c);
            }
            else if(c>'a' && c<'z'){
                System.out.println((int)c);
            }
            else if(c>'0' && c<'9'){
                System.out.println((int)c);
            }
            else{
                System.out.println((int)c);
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