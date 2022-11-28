package basics_numerals;
public class LogicalOperators {                            //used purely to compare, result in boolean(true or false)
    public static void main(String[] args) {
        int a = 20;
        int b = 10;
        System.out.println(a>b && a==20);             //both conditions should be true to give the output as true(for and or &&)
        System.out.println(a>=20 && b>15);
        System.out.println(a==20 || b==15);          // checks if any one condn is true and gives the output true(for or(||)), if the 1st condn is true wont check the 2nd condn
        System.out.println(a>=30 || b==10);
    }
}
