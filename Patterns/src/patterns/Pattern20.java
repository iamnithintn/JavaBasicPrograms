package patterns;

import java.util.Scanner;

public class Pattern20 {
    
    static void pattern(int n){

        for(int row=0;row < 2 * n;row++){   // 2n-1 number of rows

            int totalcol = row>n? 2*n- row:row;  //   when row is greater then 5 then total rows - current row num = columns
              
            int noOfSpaces = n-totalcol;   // total spaces in each row is n - totalcol/max col

            for(int s = 0; s<noOfSpaces;s++){
                System.out.print(" ");
            }

            for(int col=0;col<totalcol;col++){   
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        pattern(c);
        s.close();
    }
}



/*
 
  

    * 
   * * 
  * * * 
 * * * * 
* * * * *
 * * * * 
  * * * 
   * *
    * 




 */