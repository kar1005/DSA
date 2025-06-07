import java.util.LinkedList;
class MoveZeroToEnd {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                list.add(nums[i]);
        }
        int i=0;
        for(int n:list){
            nums[i] = n;
            i++;
        }
        while(i!=nums.length){
            nums[i]=0;
            i++;
        }
    }
}