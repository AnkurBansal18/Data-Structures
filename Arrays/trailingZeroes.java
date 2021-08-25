class Solution {
    public int trailingZeroes(int n) {
        
         int count = 0;
        while(n>0){
            n /= 5;
            count += n;
        }
        return count;
    }
}

//5*2  = 10
//count(5) will always be less than count(2)
