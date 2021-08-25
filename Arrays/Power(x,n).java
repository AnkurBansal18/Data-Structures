 class Solution {
    public double myPow(double x, int n) {
       double ans = 1.0;
       long num = n;           //to avoid overflow
        if(num < 0){
            num = -1* num;      
        } 

        
        while(num > 0){
            if(num % 2 ==0){
                x = x*x;
                num = num / 2;
            }
            else{
                ans = ans * x;
                num = num - 1;
            }
        }
        if(n<0) {
            ans = (double)(1.0) / (double)(ans);            // as pow(x,-n) = 1/pow(x.n)
        }
        return ans;
   }
 }

//why we declared num as long ?
// to avoid overflow as the num will exceed range of integer(after conversion to +ve) if its a last valid -ve input.
        //-2,147,483,648 to 2,147,483,647   (integer range)
