package basics_numerals;
public class FunAdd {

    static void add(int a, int b){                              //taking 2 arguments
    System.out.println("Addition started");
    int sum;
    sum =a+b;
    System.out.println(sum);
    System.out.println("Addition Ended");

    }


    public static void main(String[] args) {
        System.out.println("Main Started");
        add(10,20);                                     //calling the function8
        System.out.println("Main ended");
        
    }

    
}
