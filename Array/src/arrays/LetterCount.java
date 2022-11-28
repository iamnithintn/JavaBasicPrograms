package arrays;

import java.util.Scanner;

public class LetterCount {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine().toLowerCase();    

		char [] c1 = s1.toCharArray();
		char [] c2 = s1.toCharArray();
		s.close();
		for(int i=0;i<c1.length;i++){
			int count =0;
			for(int j=0;j<c2.length;j++){
				if(c1[i]==c2[j]){
					count++;
					c2[j]='\0';
				}
			}
			if(count>0){
				System.out.println(c1[i]+" --> "+count);
			}

		}
	}
}
