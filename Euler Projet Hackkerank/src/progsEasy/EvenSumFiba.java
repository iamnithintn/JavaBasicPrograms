package progsEasy;
import java.util.Scanner;

public class EvenSumFiba {


	static long fiba(long n){
		long a=0,b=1,c=0;
		long sum=0;
		while(c<n){
			c=a+b;
			if(c%2==0 && c<n){
				sum+=c;
			}
			a=b;
			b=c;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextLong();
		s.close();
		System.out.println(fiba(n));         
	}
}

