package basics_numerals;
public class ANISwiggy {
    public static void main(String[] args) {
         int ID = 9343;
         int PSD = 1234;

         if (ID==9343){
            System.out.println("Corrct ID");
            if(PSD == 1234){
                System.out.println("Corrct Password");
                System.out.println("You have logged in sucessfully");
            }
            else{
                System.out.println("Incorrect Password");
            }
         }
         else{
            System.out.println("Incorrect ID");
         }
    }
}
