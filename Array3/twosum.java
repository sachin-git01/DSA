class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                i++;
                return new int[] {i,j};

            }
        }
        return new int[] {};

    }
}
