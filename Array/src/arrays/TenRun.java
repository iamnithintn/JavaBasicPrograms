package arrays;

public class TenRun {
	public static int [] tenrun(int [] nums){
		for(int i=0;i<nums.length-1;i++){                //(nums.length-1) becasue we are checking for (i+1)
			if(nums[i]%10==0 && nums[i+1]%10!=0){
				nums[i+1]=nums[i];
			}
		}
		return nums;
	}
	public static void main(String[] args) {
		int [] nums = {1,2,30,4,50,6,90,4};

		int [] a =tenrun(nums);

		for(int m:a){
			System.out.print(m+" ");
		}
	}
}
