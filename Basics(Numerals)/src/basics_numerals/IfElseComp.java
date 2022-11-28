package basics_numerals;
public class IfElseComp {
    public static void main(String[] args) {
        
        int a =10;
        int b = 20;

        if(a>=b){                                             //if positive executes below lines
            System.out.println(a+" is greater than "+b);
        }
        else{                                                 //when if condn fails this condn is executed, if both fails no o/p
            System.out.println(a+" is lesser than "+b);
        }
                             //reverse values
        int c =100;
        int d = 20;

        if(c>=d){
            System.out.println(c+" is greater than "+d);
        }
        else{
            System.out.println(c+" is lesser than "+d);
        }
    }
}
