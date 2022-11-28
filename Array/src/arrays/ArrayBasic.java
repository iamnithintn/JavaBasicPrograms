package arrays;

import java.util.Scanner;

public class ArrayBasic {


	static public  int [] fizzArray3(int start, int end){
		int size = end-start;
		int [] a = new int[size];
		for(int i=0;i<size;i++){
			a[i]=start;
			start++;
		}
		return a;
	}    
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter start number : ");
		int start = s.nextInt();
		System.out.print("Enter end number : ");
		int end = s.nextInt();
		s.close();

		int [] b =fizzArray3(start, end); ///returns an array so store in an array
		for(int m:b){
			System.out.println(m+" ");
		}
	}

}
