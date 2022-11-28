package patterns;


public class StarPattern19 {

    
static void starPattern (int n){

    for(int row=0;row < 2 * n;row++){   // 2n-1 number of rows

        int totalcol = row>n? 2*n- row:row;  //   when row is greater then 5 then total rows - current row num = columns

        for(int col=0;col<totalcol;col++){   // col<=totalcol if 2*n-row-1
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        
        starPattern(5);
    }
}


/*



    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
  
 
 */