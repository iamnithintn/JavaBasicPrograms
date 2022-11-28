package basics_numerals;
public class SimpleIf {
    public static void main(String[] args) {
        int a = 100;
        int b =20;

        if(a>b){                                                 //since condn is true the below lines gers executed and gives o/p
        System.out.println(a+" is greater than "+b);
        }
                                           //for false condition
        int c = 20;
        int d = 100;

        if(c>d){                                            //since condn the below line does not executed and no o/p
        System.out.println(c+" is greater than "+c);
        }


    }
}
