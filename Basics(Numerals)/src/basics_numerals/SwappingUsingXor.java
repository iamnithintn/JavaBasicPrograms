package basics_numerals;

import java.util.Scanner;

public class SwappingUsingXor {
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter the 1st number: ");
            int x = s.nextInt();
            System.out.print("Enter the 2nd number: ");
            int y = s.nextInt();

            System.out.println("Number before Swapping x : "+x+" y : "+y);

            x = x^y;
            y = x^y;
            x = x^y;

            System.out.println("Number after Swapping x : "+x+" y : "+y);


        System.out.print("Do you wish to continue? Y for yes, N for No : ");
        char d = s.next().charAt(0);
            if(d=='N' || d=='n'){
                break;
            }

        }
        s.close();
    }
}
