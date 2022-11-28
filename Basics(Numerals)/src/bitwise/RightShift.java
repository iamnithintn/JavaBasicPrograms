package bitwise;

public class RightShift {
    public static void main(String[] args) {
/*
     
        Shifts the whole binary values to the right by the right shift value.(PS: The last values are omitted or no longer considered)


                n>>1===n/2
                n>>2===n/4
                n>>3===n/8
                n>>4===n/16
                n>>5===n/32

    Note: Right shift value == number / (2) power right shift amount

 */

        System.out.println(2>>2);         //0
        System.out.println(26>>2);        //6
        System.out.println(45>>3);        //5
        System.out.println(103324>>12);   //25
        System.out.println(7777>>7);      //60

    }
}
