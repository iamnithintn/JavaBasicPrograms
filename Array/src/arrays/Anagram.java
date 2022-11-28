package arrays;

import java.util.Scanner;

public class Anagram {

	static String sorting(char[] c){
		String s1="";

		for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++)
				if(c[i]>c[j]){
					char temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			s1+=c[i];
		}
		return s1;                                                                   //     for(char m: c){
	}                                                                                //         s1+=m;

	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Enter the 1st String : ");
		String str = s.nextLine().toLowerCase();
		System.out.print("Enter the 2nd String : ");
		String str1= s.nextLine().toLowerCase();


		if(str.length()==str1.length()){

			char c1 [] = str.toCharArray();
			char c2 [] = str1.toCharArray();

			String x = sorting(c1);
			String y = sorting(c2);

			System.out.println(((x.equals(y))?"Anagram":"Not Anagram"));
		}
		else{
			System.out.println("Not anagram");
		}
		s.close();
	}
}