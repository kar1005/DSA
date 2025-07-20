class MAxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int max_len=0;
        int len=0;
        int zeros=0;
        int left=0,right=0;
        while(right<nums.length){
            if(nums[right]==0)
                zeros++;
            if(zeros>k){
                if(nums[left]==0)
                    zeros--;
                left++;
            }
            if(zeros<=k){
                len = right - left +1;
                max_len = Math.max(len,max_len);
            }
            right++;
        }
        return max_len;
    }
}