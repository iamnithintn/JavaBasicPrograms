package basics_numerals;
public class Switch {
    public static void main(String[] args) {
        
        char grade = 'b';

        switch(grade){
            case 'a': System.out.println("Excellent");
            break;
            case 'b': System.out.println("Good");
            break;
            case 'c': System.out.println("Not Bad");
            break;
            case 'f': System.out.println("Fail");
            break;
            default: System.out.println("Invalid input");
        }
    }
}
