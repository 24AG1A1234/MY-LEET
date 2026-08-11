class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]==1){
                i++;
                j=Math.max(i,j);
            }
            else{
                i=0;
            }
        }
        return j;
    }

}