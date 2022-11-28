package basics_numerals;
public class IfElseVote {
    public static void main(String[] args) {
        int age = 22;

        if (age>=18){                                                        //+ve
            System.out.println("You are eligible for voting");
        }
        else{
            System.out.println("Minimum age for voting is 18, you are eligible after "+(18-age)+" year");
        }

                                        //reverse values

        int age1 = 17;

        if (age1>=18){
            System.out.println("You are eligible for voting");
        }
        else{                                                                   //+ve
            System.out.println("Minimum age for voting is 18, you are eligible after "+(18-age1)+" year");
        }

    }
}
