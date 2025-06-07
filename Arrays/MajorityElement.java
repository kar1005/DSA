class MajorityElement {
    public int majorityElement(int[] nums) {
        int element = nums[0], count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element)
                count++;
            else{
                count --;
                if(count==0)
                    element = nums[i+1];
            }
        }
        return element;
    }
}