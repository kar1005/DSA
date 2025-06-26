class SingleNumber {
    public int singleNumber(int[] nums) {
        int num = 0;
        for(int n:nums){
            num = num ^ n;
        }
        return num;
    }
}