package basics_numerals;
public class ACondnStudentResult {
    public static void main(String[] args) {
        
        int marks = 65;

        if (marks>=90){
            System.out.println("You have Grade, A(Outstanding)");
        }
        else if (marks>=80){
            System.out.println("You have Grade, B(Very Good)");
        }
        else if (marks>=70){
            System.out.println("You have Grade, C(Good)");
        }
        else if (marks>=60){
            System.out.println("You have Grade, D(First Class)");
        }
        else if (marks>=50){
            System.out.println("You have Grade, E(Second Class)");
        }
        else {
            System.out.println("You have Grade, F(Fail)");
        }
    }
}
