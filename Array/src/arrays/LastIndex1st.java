package arrays;

public class LastIndex1st {
	public static void main(String[] args) {
		int i,temp,t,n,j=3,a [] = {10,20,30,40,50};


		for(t=0;t<j;t++){
			n=a.length;
			temp = a[n-1];

			for (i=n-1;i>=1;i--){
				a[i]=a[i-1];       
			}
			a[0]=temp;
		}
		for (int k:a){
			System.out.print(k+" ");

		}
	}
}
