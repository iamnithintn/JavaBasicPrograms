package patterns;

import java.util.Scanner;

public class StarPattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,n;

        while(true){
            n= s.nextInt();
             for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                     System.out.print("* ");             //interchange between j and i
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
