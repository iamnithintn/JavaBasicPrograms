package arrays;

public class WeirdArraySort {
	public static void main(String[] args) {
		int i,j;
		int [] a = {7,12,3,44,55,80,9};
		// int [] a = {7,12,3,44,55,80,9};
		// int [] b = new int [a.length];

		for(i=0;i<a.length;i++){
			int res = -1;
			for(j=i+1;j<a.length;j++){
				if(a[i]<a[j]){
					a[i] = a[j];
					break;
				}
				else {
					a[i]=res;
				}
			}
		}
		for(int m:a){
			System.out.print(m+" ");
		}
	}
}
