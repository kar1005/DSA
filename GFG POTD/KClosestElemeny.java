//GFG:https://www.geeksforgeeks.org/problems/k-closest-elements3619/1
//Approaches used: BS + Two pointer

import java.util.*;
class KClosestElement {
    int[] printKClosest(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int ans = 0;
        int low = 0;
        int high = n - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<x){
                ans = mid;
                low = mid + 1;
            }else
                high = mid - 1;
        }
        int ind1=ans;
        int ind2 = ans + 1;
        while(k!=0){
            int dif1=Integer.MAX_VALUE;
            int dif2=Integer.MIN_VALUE;
            
            // Skip x if present
            while (ind1 >= 0 && arr[ind1] == x) ind1--;
            while (ind2 < n && arr[ind2] == x) ind2++;
            
            if(ind1>=0)
                dif1 = Math.abs(x-arr[ind1]);
            if(ind2<n)
                dif2 = Math.abs(x-arr[ind2]);
            if(ind1 >= 0 && (ind2 >= n || dif1 < dif2 || (dif1 == dif2 && arr[ind1] > arr[ind2]))){ //handing various edge cases
                list.add(arr[ind1]);
                ind1--;
            }else{
                list.add(arr[ind2]);
                ind2++;
            }
            k--;
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);  
        }
        return array;
    }
}
