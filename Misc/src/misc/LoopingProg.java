package misc;

import java.util.Scanner;

public class LoopingProg {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        while(true){






        System.out.print("Do you wish to continue? Y for yes, N for No : ");
        char d = s.next().charAt(0);
            if(d=='N' || d=='n'){
                break;
            }




        }
        s.close();
    }
}
