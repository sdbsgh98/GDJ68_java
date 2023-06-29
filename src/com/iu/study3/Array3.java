package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(nums.length);

		//nums: 5칸 출력(1, 2, 3, 4, 5)
		int[] copyNums = new int[nums.length+1];
		
		for(int i=0; i<nums.length; i++) {
			copyNums[i] = nums[i];
		}
		copyNums[nums.length] = 5;
	
		nums = copyNums;
		
		//nums: 4칸 출력(1, 2, 3, 4)
		copyNums = new int[nums.length-1]; //4
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i] = nums[i];
		}
		nums = copyNums;
		
		for(int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
