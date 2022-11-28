package bitwise;

public class And {
    public static void main(String[] args) {

/*
 *                     multiples of 2^n where n=(0-infinity)
 * 
 *                      2^n  2^3  2^2  2^1  2^0
 *                            8    4    2    1
 * 
 *                 12---->    1    1    0    0
 *                 7----->    0    1    1    1
 *                 OP---->    0    1    0    0------>4
 * 
 *          Explanation: If both are 1 the Op is 1
 *          Note 1: if both are odd/even the op is the lowest number
 *          Note 2: if one is odd and the other is even the above method is used
 *          Note 3: if one is odd and the other is 1 the op is 1
 *          Note 4: if one is even and the other is 0 the op is 0
 *                 
 */

        System.out.println(5&7);          //op-->5====Lowest(same)
        System.out.println(12&7);           //op-->4====using the method
        System.out.println(55&17);          //op-->17====Lowest
        System.out.println(2&6);        //op-->2====Lowest
        System.out.println(5&1);    //odd and 1 ====OP-->1
        System.out.println(20&1);   //even and 1 ====OP-->0


    }
}
