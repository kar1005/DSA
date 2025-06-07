class NumberAppearingOnce {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
}
/*
Brute Forcce
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int freq =0;
            if(map.containsKey(nums[i]))
                freq = map.get(nums[i]);
            map.put(nums[i],freq+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)==1)
                return n;
        }
        return 0;

 */