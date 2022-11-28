package bitwise;

public class XOR {
    public static void main(String[] args) {
        
/*

multiples of 2^n where n=(0-infinity)

                      2^n  2^3  2^2  2^1  2^0
                            8    4    2    1

                 12---->    1    1    0    0
                 7----->    0    1    1    1
                 OP---->    1    0    1    1------>11


   Note 1: if both are different the op is 1
   Note 2: if both are same the op is 0
 */

  System.out.println(9^6);             //15
  System.out.println(12^7);             //11
  System.out.println(12^4);             //8
  System.out.println(13^12);            //1
  System.out.println(29^73);            //84


    }
}
