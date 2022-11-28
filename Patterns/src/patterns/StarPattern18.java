package patterns;

import java.util.Scanner;

public class StarPattern18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,n;

        while(true){
            System.out.print("Enter the value : ");
            n= s.nextInt();
            for(i=n;i>0;i--){
               for(j=0;j<i;j++){
                   System.out.print("*");
               }
               System.out.println();
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
