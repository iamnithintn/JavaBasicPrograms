package basics_numerals;
import java.util.Scanner;

class PrimeNums{
    public static void main(String[] args) {
        int i,x,ref=0;

        Scanner s = new Scanner(System.in);

        x = s.nextInt();
        s.close();

        for (i=2; i<x; i++){
            if (x%2==0){
                ref+=1;
                break;
            }
        }

        if (ref==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime") ;
        }

    }
}