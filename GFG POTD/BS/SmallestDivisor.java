import java.util.*;
class SmallestDivisor {
    int smallestDivisor(int[] arr, int k) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid  + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] arr, int k, int div){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            count += (int)Math.ceil((double)arr[i]/div);
        }
        if(count<=k)
            return true;
        else
            return false;
    }
}