package basics_numerals;
import java.util.Scanner;

public class TernaryGreatestNums {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(true){
            System.out.print("Enter the 1st number : ");
            int a = s.nextInt();
            System.out.print("Enter the 2nd number : ");
            int b = s.nextInt();
            System.out.print("Enter the 3rd number : ");
            int c = s.nextInt();


            int greatest = ((a>b)&&(b>c))?a:(b>c)?b:c;
            System.out.println("Greatest among the three is "+greatest);

            System.out.print("Do you wish to continue? Y for yes, N for No : ");
            char d = s.next().charAt(0);
                if(d=='N' || d=='n'){
                    break;
                }

        }
        s.close();
    }
}
