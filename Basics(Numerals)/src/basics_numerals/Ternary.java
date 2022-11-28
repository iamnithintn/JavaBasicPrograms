package basics_numerals;
public class Ternary {
    public static void main(String[] args) {
        int a=30,b=45,c=12,x;

        

        x=(a>b && a>c)?a:(b>c)?b:c;     //[["[(a>b && a>c)?a]:(b>c)?b"]]:c
        System.out.println(x);


        String y;

        y=(b%2==0)?"Even":"Odd";
        System.out.println(y);


        System.out.println((a&1)==0?"Even":"Odd");          //bitwise
        System.out.println((b&1)==0?"Even":"Odd");          //bitwise

 
    }
}
