package basics_numerals;
public class IfElseIfComp {
    public static void main(String[] args) {
        
        int a = 100;
        int b =20;

        if (a>b){                                                         //if positive executs the lines below
            System.out.println(a+" is greater than "+b);
        }
        else if (a==b){                                                    //when if is -ve and else if is +ve executes the below lines
            System.out.println(a+" Equals "+b);
        }
        else{                                                      //when both if and elseif is -ve, else is triggered
            System.out.println(a+" is lesser than "+ b);
        }
 //-------------------------------------------------------------------------------------------------------------------------

        int c = 20;
        int d =20;
        if (c>d){
            System.out.println(c+" is greater than "+d);
        }
        else if (c==d){
            System.out.println(c+" Equals "+d);
        }
        else{
            System.out.println(c+" is lesser than "+ d);
        }
//-------------------------------------------------------------------------------------------------------------------------

        int e = 100;
        int f =200;

        if (e>f){
            System.out.println(e+" is greater than "+f);
        }
        else if (e==f){
            System.out.println(e+" Equals "+f);
        }
        else{
            System.out.println(e+" is lesser than "+ f);
        }
    }
}
