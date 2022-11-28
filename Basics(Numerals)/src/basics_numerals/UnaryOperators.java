package basics_numerals;
public class UnaryOperators {
    public static void main(String[] args) {

                                                //post-increment 
        int a =1;
        int b = a++;                             
        System.out.println("The value of a is "+a+". The value of b is "+b);  //assigns the value of a to b, then increaments the value and then assigns to a
        
                                                //pre-increment
        int c = 1;
        int d = ++c;
        System.out.println("The value of c is "+c+". The value of d is "+d);  //increaments the value and assigns to d, and the incremeanted value is assigned to c
        
                                                //post-decrement
        int e = 1;
        int f = e--;
        System.out.println("The value of e is "+e+". The value of f is "+f);  //assigns the value of e to f, then stores the decremented value to e
        
                                                //pre-decrement
        int g = 1;
        int h = --g;
        System.out.println("The value of g is "+g+". The value of h is "+h); //decrements the value and stores in h, and the decremnted value is stored in g

    }
}
