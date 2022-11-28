package basics_numerals;
import java.util.Scanner;

public class GreatestOf3Nums {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter the 1st number : ");
            int a = s.nextInt();
            System.out.print("Enter the 2nd number : ");
            int b = s.nextInt();
            System.out.print("Enter the 3rd number : ");
            int c = s.nextInt();

            if(a>b && a>c){
                System.out.println(a+" is the greatest");
            }
            else if (b>c){
                System.out.println(b+ " is the greatest");
            }
            else{
                System.out.println(c+ " is the greatest");
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
