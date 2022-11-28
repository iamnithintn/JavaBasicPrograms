package basics_numerals;
public class NestedIf {
    public static void main(String[] args) {
        int a = 200;
        int b = 100;

        if (a>=b){
            if (a==b){
                System.out.println("And "+a+" is equal to "+b);
            }
            else{
                System.out.println(a+" is greater than "+b);
            }
        }
        else{
            System.out.println(a+" is lesser than "+b);
        }
    }
}
