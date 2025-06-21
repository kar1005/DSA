//GFG:https://www.geeksforgeeks.org/problems/police-and-thieves--141631/1
class PoliceThief {
    public int catchThieves(char[] arr, int k) {
       int police = 0;
       int theif = 0;
       int count = 0;
        while(police<arr.length && arr[police]!='P')police++;
        while(theif<arr.length && arr[theif]!='T')theif++;
       while(police<arr.length && theif<arr.length){
           if(Math.abs(police-theif)<=k){
               count++;
               police++;
               theif++;
           }else if(police<arr.length && police<theif)police++;
           else if(theif<arr.length && police>theif)theif++;
            while(police<arr.length && arr[police]!='P')police++;
            while(theif<arr.length && arr[theif]!='T')theif++;
       }
       return count;
    }
}