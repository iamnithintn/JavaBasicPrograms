package strings;

import java.util.Scanner;
public class MaxWords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] a = s.split(" ");
        int max=0,z=0;
        sc.close();

        for(int i=0;i<a.length;i++){
            int count=0;
            for(int j=0;j<a.length;j++){
                if(a[i].equals(a[j])){
                    count++;
                }
            }
            if(count>max){
                max=count;
                z=i;
            }
        }
        System.out.println(a[z]);
    }
}
