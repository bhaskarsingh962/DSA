class Solution {

    public int check(int num1){
        String val = Integer.toString(num1);
        int n = val.length();
        if(n < 3) return 0;
        int prev = val.charAt(0) - '0';
        int curr = val.charAt(1) - '0';
        int next = val.charAt(2) - '0';
        int count = 0;
        for(int i=1;i<n-1;i++){
            next = val.charAt(i+1) - '0';
            if((curr < next && curr < prev) || (curr > next && curr > prev) ) count++;
            prev = curr;
            curr = next;
        }
        return count;
    }

    public int totalWaviness(int num1, int num2) { 
       int  waviness = 0;
       for(int i=num1; i<= num2; i++){
         waviness += check(i);
       }
       return waviness;
    }
}