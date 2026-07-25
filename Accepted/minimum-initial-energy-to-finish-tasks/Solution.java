class Solution {


    public boolean check(int[][] tasks, int[][] diff, int val, int n) {
        for (int i = 0; i < n; i++) {
            int actual = tasks[diff[i][0]][0];
            int minimum = tasks[diff[i][0]][1];
            
            if (val < minimum) return false;
            val -= actual;
        }
        return val >= 0;
    }

    public int minimumEffort(int[][] tasks) {
      int n = tasks.length;
      int[][] diff = new int[n][2];
      int start = 0;
      int end = 1000000000;
      int ans = 1000000000; 

      for(int i=0;i<n;i++){
        int dif = tasks[i][1] - tasks[i][0]; 
        diff[i][0] = i;
        diff[i][1] = dif;
      }
      Arrays.sort(diff, (a, b) -> Integer.compare(b[1], a[1]));
      
      while (start <= end) {
            int mid = start + (end - start) / 2; 
            
            if (check(tasks, diff, mid, n)) {
                ans = mid;       
                end = mid - 1;
            } else {
                start = mid + 1; 
            }
        }
        return ans;
    }
}