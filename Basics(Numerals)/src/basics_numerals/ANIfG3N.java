package basics_numerals;
public class ANIfG3N {
    public static void main(String[] args) {
        
        int a = 10, b = 20, c = 30;

        if(a >= b) {
            if(a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } 
        else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
    }
}
