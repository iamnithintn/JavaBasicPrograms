package arrays;

public class Pre4 {
	public static int[] pre4(int[] nums){
		int k=0;
		int [] a = new int[nums.length];
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=4){
				a[k]=nums[i];
			}
			else if(nums[i]==4){
				break;
			}

		}

		return a;
	}

	public static void main(String[] args) {

		int [] b = {1,2,3,4,5,6,7};

		int [] c = pre4(b);

		for(int m : c){
			System.out.print(m+" ");
		}
	}
}
