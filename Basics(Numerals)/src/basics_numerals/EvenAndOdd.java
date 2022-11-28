package basics_numerals;
public class EvenAndOdd {
    public static void main(String[] args) {
        int i;
        for (i=1;i<=20;i++){                                            //looping through 20 numbers
            if (i%2==0){                                              //checking for even and odd values
                System.out.println(i+" is even");
            }
            else{
                System.out.println(i+ " is odd");
            }
        }
    }
}
