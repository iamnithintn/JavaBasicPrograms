package assignment;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);

        while(true){
  
            System.out.print("Enter the number : ");
            int n = s.nextInt();
            int i,count=0;

            for(i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            System.out.println((count==0)?"Prime":"Not Prime");

            
            System.out.print("Continue? N for no, any key for yes : ");
            char c = s.next().charAt(0);

            if(c=='n'||c=='N'){
                break;
            }
        }
        s.close();
    }
}
