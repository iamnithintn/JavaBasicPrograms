package strings;

public class WordToArray {
    public static void main(String[] args) {
        int count =0;
        String s = "Nithin";

        char [] c =s.toCharArray();

        for(char i:c){
            System.out.print(i+" ");
            count++;
        }

        System.out.println("No of letters in the word: "+count);
    }
}
