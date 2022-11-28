package basics_numerals;
public class ASwSGrading {
    public static void main(String[] args) {
        
        char grade = 'F';

        switch(grade){
            case 'O': System.out.println("Distinction"); 
            break;
            case 'D': System.out.println("First Class Distinction");
            break;
            case 'F': System.out.println("First Class");
            break;
            case 'S': System.out.println("Second Class");
            break;
            case 'G': System.out.println("Fail");
        }
    }
}
