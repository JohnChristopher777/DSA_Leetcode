class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;

        if(len<=0) return 0;

        if(len==1) return 1;

        int i=0;
        for(int j=1;j<len;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }

        return i+1;
    }
}