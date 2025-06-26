//Link:https://www.geeksforgeeks.org/problems/game-with-string4100/1
//Step 1: find frequencies for each character
//Step 2: add frequencies to a max heap
//Step 3: remove k characters from the heap, decrementing their frequency
//Step 4: Calculate the sum of squares of frequencies

import java.util.Collections;
import java.util.PriorityQueue;
class GameWithString {
    public int minValue(String s, int k) {
        // code here
        int[] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
        }
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int f : freq){
            if(f > 0) maxHeap.add(f);
        }
        
        while(k-- > 0  && !maxHeap.isEmpty()){
            int top = maxHeap.poll();
            if(top > 1){
                maxHeap.add(top - 1);
            }
        }
        
        int result = 0;
        
        while(!maxHeap.isEmpty()){
            int f = maxHeap.poll();
            result += f*f;
        }
        
        return result;
    }
}