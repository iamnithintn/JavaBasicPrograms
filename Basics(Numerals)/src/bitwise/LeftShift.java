package bitwise;

public class LeftShift {
    public static void main(String[] args) {
/*
     
        Shifts the whole binary values to the left by the left shift value.(PS: 0's are added at trailing)


                n>>1===n/2
                n>>2===n/4
                n>>3===n/8
                n>>4===n/16
                n>>5===n/32

    Note: Left shift value == number * (2) (power) left right shift amount

 */

        System.out.println(2<<2);         //8
        System.out.println(26<<2);        //104
        System.out.println(45<<3);        //360
        System.out.println(1024<<6);   //65536
        System.out.println(77<<7);      //9856

    }
}
