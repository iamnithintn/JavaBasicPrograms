package basics_numerals;
import java.util.Scanner;

class PrimeNums{
    public static void main(String[] args) {
        int i,x,ref=0;

        Scanner s = new Scanner(System.in);

        x = s.nextInt();
        s.close();

        for (i=2; i<x; i++){
            if (x%i==0){
                ref+=1;
                break;
            }
        }

        System.out.println((ref>0)?"Not Prime":"Prime");

    }
}