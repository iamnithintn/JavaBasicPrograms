package basics_numerals;
public class AAtmWithdrawal {
    public static void main(String[] args) {
        
        int bal =19999;
        int withdrawal = 3000;

        if (withdrawal<bal){
            while(withdrawal<=bal){
                bal-=withdrawal;
                System.out.println("Available balance is "+bal);   
            }
            System.out.println("Insufficient Balance to withdraw "+withdrawal);
        }
        else{
            System.out.println("Insufficient Balance");
        }

    }
}
