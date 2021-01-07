Solution 1 - Using Stack
Time complexity - O(n)
Space complexity - O(n)

class Solution {
public int minAddToMakeValid(String S) {

    int sum =0;
   
 Stack<Character> st = new Stack<Character>();
  for(int i=0; i<S.length(); i++){
     if((S.charAt(i)=='('))
       st.push(S.charAt(i));
     if((S.charAt(i)==')'))
       if(st.isEmpty())             
            sum++;                       // for its counter open brackets.
       else
        st.pop();     // since if open bracket is already present in stack, then we just need to pop it(as it'll become valid)    
        }
       return sum + st.size();          //st.size() is added for remaining elements in stack.
}
}

Solution 2 - Without Using Stack
Time complexity - O(n)
Space complexity - O(1)

class Solution {
public int minAddToMakeValid(String S) {
int sum=0;
int count =0;
for(int i=0; i<S.length(); i++){
if((S.charAt(i)=='('))
sum++;
else if(--sum<0){
sum++;
count++;
}
}
return sum+count;

 }}
