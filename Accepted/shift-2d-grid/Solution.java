class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        List<List<Integer>>ans = new ArrayList<>();
        ArrayList<Integer>li = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               li.add(grid[i][j]);
            }
        }
        int total = m*n;
        int size = li.size();
        k = k % total;
        k = total - k; 
        for(int i=0;i<m;i++){
          List<Integer>row = new ArrayList<>();  
          for(int j=0;j<n;j++){
            k = k % total;  
            row.add(li.get(k));
            k++; 
          }
          ans.add(row);
        }
        return ans;
    }
}