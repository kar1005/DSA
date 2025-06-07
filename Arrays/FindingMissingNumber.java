class FindingMissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 =0, xor2=0;
        for(int i=0;i<nums.length;i++){
            xor1 = xor1 ^ nums[i];
            xor2 = xor2 ^ i;
        }
        xor2 = xor2 ^ n;
        return xor1 ^ xor2;
    }
}