package progsEasy;

import java.util.Scanner;

public class LargestPrimeFactor {

	public static void main(String[] args) {
		int x=17,i,c=0,max=0,y=0;

		for (i = 1; i <=x; i++) {
			if (x% i == 0) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						c++;
					}
					if(c==0) {
						
					}
					y = (c == 0) ? i : 0;
				}
				if (y > max) {
					max = y;
				}
			}
		}
		System.out.println(max);
	}
}
