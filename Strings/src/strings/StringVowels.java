package strings;

public class StringVowels {
    public static void main(String[] args) {
        int i,count =0;
        String s = "Jesus Christ on a motercycle";

        for(i=0;i<s.length();i++){
            s=s.toLowerCase();
            char c = s.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
                System.out.print(c+" ");
            }
        }
        System.out.println();
        System.out.println("No of vowels : "+count);
    }
}
