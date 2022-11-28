package strings;

public class StringToArray {
    public static void main(String[] args) {
        String s = "Hello Mf's, what a wonderful world";

        String [] a =s.split(" ");

        for(String i:a){
            System.out.println(i);
        }
       }
}
