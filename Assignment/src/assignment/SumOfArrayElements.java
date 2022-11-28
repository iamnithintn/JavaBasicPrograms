package assignment;
import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter the array size : ");
        int size = s.nextInt();
        int [] a = new int [size];

        int i,sum=0;
        s.close();

        System.out.println("Enter the array elements");
        for(i=0;i<size;i++){
            a[i]=s.nextInt();
        }
        // for(int m : a){
        //     System.out.print(m+" ");
        // }
        for(i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);

    }
}
