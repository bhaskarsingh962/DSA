class Solution {
    public int largestAltitude(int[] gain) {
        int maxAl = 0;
        int n = gain.length;
        int sum = 0;
        for(int i=0;i<n;i++){
          sum += gain[i];  
          if(sum > maxAl) maxAl = sum; 
        }
        return maxAl;
    }
}