package bitwise;

public class Or {
    public static void main(String[] args) {

/*
 *                     multiples of 2^n where n=(0-infinity)
 *
 *                      2^n  2^3  2^2  2^1  2^0
 *                            8    4    2    1
 *
 *                 12---->    1    1    0    0
 *                 7----->    0    1    1    1
 *                 OP---->    1    1    1    1------>15
 *
 */
      System.out.println(1|2);              //3
      System.out.println(5|7);              //7
      System.out.println(12|7);            //15
      System.out.println(15|77);            //79
      System.out.println(44|66);            //110


    }
}
